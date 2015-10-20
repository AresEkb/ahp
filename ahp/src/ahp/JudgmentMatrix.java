package ahp;

import java.util.List;

public class JudgmentMatrix<T> {
	private static final double PRECISION = 0.0001;
	private static final int MAX_ITERATIONS = 30;
	private static final double[] RANDOM_INCONSISTENCY = { 0.00, 0.00, 0.58, 0.90, 1.12, 1.24, 1.32, 1.41, 1.45, 1.49, 1.51, 1.48, 1.56, 1.57, 1.59 };

	private final List<T> objectList;
	private final int dim;
	private final Matrix matrix;
	
	private Vector eigenvector;
	private double eigenvalue;
	private boolean isDirty = true;

	public JudgmentMatrix(List<T> objectList) {
		this.objectList = objectList;
		this.dim = objectList.size();
		this.matrix = new Matrix(dim, dim, 1);
		this.eigenvector = new Vector(dim);
	}
	
	public void set(T first, T second, int value) {
		if (value == 0 || Math.abs(value) > 9) {
			throw new IllegalArgumentException("Value must be between 1 and 9 or between -1 and -9");
		}
		double newValue = value > 0 ? value : 1.0 / -value;
		double inverseValue = value > 0 ? 1.0 / value : -value;
		int i = this.objectList.indexOf(first);
		int j = this.objectList.indexOf(second);
		if (Math.abs(matrix.get(i, j) - newValue) > PRECISION) {
			isDirty = true;
		}
		matrix.set(i, j, newValue);
		matrix.set(j, i, inverseValue);
	}

	public Vector getEigenvector() throws Exception {
		calc();
		return eigenvector;
	}
	
	public double findEigenvectorElement(T obj) throws Exception {
		calc();
		int i = this.objectList.indexOf(obj);
		return eigenvector.get(i);
	}
	
	public double getEigenvalue() throws Exception {
		calc();
		return eigenvalue;
	}
	
	public double getAbsInconsistency() throws Exception {
		return (getEigenvalue() - dim) / (dim - 1);
	}

	public double getInconsistency() throws Exception {
		return getAbsInconsistency() / RANDOM_INCONSISTENCY[dim - 1];
	}

	private void calc() throws Exception {
		if (isDirty) {
			Vector x = new Vector(dim, 1.0 / dim);
			//Vector y = matrix.multiply(x);
			//double sum = y.sum();
			//x = y.div(sum);
			//double curEigenvalue = sum / dim;
			double curEigenvalue = 0, prevEigenvalue;
			int i = 0;
			do {
				if (i >= MAX_ITERATIONS) {
					throw new Exception(String.format("Eigenvector was not found after %d iterations", MAX_ITERATIONS));
				}
				prevEigenvalue = curEigenvalue;
				Vector y = matrix.multiply(x);
				curEigenvalue = y.sum();
				x = y.div(curEigenvalue);
			} while (i++ == 0 || Math.abs(curEigenvalue - prevEigenvalue) > PRECISION);
			eigenvector = x;
			eigenvalue = curEigenvalue;
		}
		isDirty = false;
	}
}
