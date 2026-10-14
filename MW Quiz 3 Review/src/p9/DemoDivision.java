package p9;

import java.util.Scanner;

public class DemoDivision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a numerator and denominator: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		
		if(n2 == 0) {
			System.out.println("Cannot divide by zero.");
		} else {
			double quotient = n1 / n2;
			if(quotient > 0) {
				System.out.println("Positive");
			} else if(quotient == 0) {
				System.out.println("Zero");
			} else {
				System.out.println("Negative");
			}
			System.out.printf("%.2f", quotient);
		}
	}

}
