package p2_calculator;

public class Main {

	public static void main(String[] args) {
		System.out.printf("%.2f%n", Calculator.add(1.1, 2.2));
		System.out.printf("%.2f%n", Calculator.subtract(1.1, 2.2));
		System.out.printf("%.2f%n", Calculator.multiply(1.1, 2.2));
		System.out.printf("%.2f%n", Calculator.divide(1.1, 2.2));
		
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		System.out.printf("%.2f%n", c1.sqrt(9.0));
		System.out.printf("%.2f%n", c2.sqrt(9.0));
		System.out.printf("%.2f%n", c1.pow(3, 2));
		
	}

}
