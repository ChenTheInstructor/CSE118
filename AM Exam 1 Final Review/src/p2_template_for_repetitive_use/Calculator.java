package p2_template_for_repetitive_use;

public class Calculator {
	// fields
	// 1. instance fields
	private double n1;
	private double n2;

	// 2. static fields
	private static String type = "Simple Calculator";

	public Calculator(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
		type = "Basic Calculator";
	}
	
	public double add() {
		return n1 + n2;
	}
	
	public double subtract() {
		return n1 = n2;
	}
	
	public double multiply() {
		return n1 * n2;
	}
	
	public double divide() {
		return n1 / n2;
	}

	public Calculator() {
		type = "Basic Calculator";
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Calculator.type = type;
	}

	@Override
	public String toString() {
		return "[n1=" + n1 + ", n2=" + n2 + "]";
	}

}
