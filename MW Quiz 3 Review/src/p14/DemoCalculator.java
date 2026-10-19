package p14;

import java.util.Scanner;

public class DemoCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("\n\nEnter a math expression ( e.g.2.3 * 4.1): ");
			double n1 = scanner.nextDouble();
			String op = scanner.next();
			double n2 = scanner.nextDouble();
			switch (op) {
			case "+":
				System.out.print(n1 + " + " + n2 + " = ");
				System.out.printf("%.2f", (n1 + n2));
				break;
			case "-":
				System.out.print(n1 + " - " + n2 + " = ");
				System.out.printf("%.2f", (n1 - n2));
				break;
			case "*":
				System.out.print(n1 + " * " + n2 + " = ");
				System.out.printf("%.2f", (n1 * n2));
				break;
			case "/":
				if (n2 == 0.0) {
					System.out.println("Invalid Operator!");
				} else {
					System.out.print(n1 + " / " + n2 + " = ");
					System.out.printf("%.2f", (n1 / n2));
				}
				break;
			default:
				System.out.print("Not a valid operator for this calculator");
			}
		}

	}

}
