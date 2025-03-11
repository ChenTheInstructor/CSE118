package p2_coding_problems;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: " );
		double num1 = scanner.nextDouble();
		System.out.print("Enter second number: " );
		double num2 = scanner.nextDouble();
		
		System.out.printf("Product: %.2f",  (num1 * num2));
	}

}
