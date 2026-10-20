package p9;

import java.util.Scanner;

public class DemoDivisionWithZeroCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two double values: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		
		if(n2 == 0) {
			System.out.println("Cannot divide by zero.");
		} else {
			double q = n1 / n2;
			if(q == 0) {
				System.out.println("Zero");
			} else if(q > 0) {
				System.out.println("Positive");
			} else {
				System.out.println("Negative");
			}
		}
	}

}
