package Lecture230424;

public class Calc implements Calculator{
	public static final double PI = 3.14;
	private int memory;
	
//	public int add(int a, int b) {
//		int sum = a + b;
//		this.memory = sum;
//		return sum;
//	}
	
	public static double getCircleLength(double r) {
		return 2 * PI * r;
		//PI = calc.PI
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public int add(int a, int b) {
		int sum = a + b;
		this.memory = sum;
		return sum;
	}
	
}
