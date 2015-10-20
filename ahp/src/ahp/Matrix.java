package ahp;

public class Matrix {
	private final int dim1;
	private final int dim2;
	private final double[][] data;
	
	public Matrix(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.data = new double[dim1][dim2];
	}

	public Matrix(int dim1, int dim2, double value) {
		this(dim1, dim2);
		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				this.data[i][j] = value;
			}
		}
	}

	public double get(int i, int j) {
		return data[i][j];
	}

	public void set(int i, int j, double value) {
		data[i][j] = value;
	}

	public Vector multiply(Vector vector) {
		Vector result = new Vector(dim1);
		for (int i = 0; i < dim1; i++) {
			for (int j = 0; j < dim2; j++) {
				result.add(i, get(i, j) * vector.get(j));
			}
		}
		return result;
	}
}
