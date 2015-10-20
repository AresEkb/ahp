package ahp;

public class Vector {
	private final int dim;
	private final double[] data;

	public Vector(int dim) {
		this.dim = dim;
		this.data = new double[dim];
	}

	public Vector(int dim, double value) {
		this(dim);
		for (int i = 0; i < dim; i++) {
			this.data[i] = value;
		}
	}
	
	public double get(int i) {
		return data[i];
	}

	public void set(int i, double value) {
		data[i] = value;
	}

	public void add(int i, double value) {
		data[i] += value;
	}

	public double sum() {
		double sum = 0;
		for (int i = 0; i < dim; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public double avg() {
		return sum() / dim;
	}
	
	public Vector div(double value) {
		Vector result = new Vector(dim);
		for (int i = 0; i < dim; i++) {
			result.set(i, data[i] / value);
		}
		return result;
	}
}
