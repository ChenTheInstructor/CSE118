package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter two whole numbers: ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println("The sum: " + add(x, y));
			System.out.println("The difference: " + subtract(x, y));
			System.out.println("The product: " + multiply(x, y));
			System.out.println("The quotient: " + divide(x, y));
		}
	}

	// add method
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	// subtract method
	public static int subtract(int n1, int n2) {
		return n1 - n2;
	}
	
	// multiply method
	public static int multiply(int n1, int n2) {
		return n1 * n2;
	}
	
	
	// divide method
	public static int divide(int n1, int n2) {
		return n1 / 2;
	}
}
