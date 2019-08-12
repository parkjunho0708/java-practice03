package prob06_1;

public abstract class Arith {
	protected int a;
	protected int b;

	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}