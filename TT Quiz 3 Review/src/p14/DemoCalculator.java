package p14;

import java.util.Scanner;

public class DemoCalculator {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the math expression (e.g. 3 + 4): ");
		double n1 = kb.nextDouble();
		char op = kb.next().charAt(0);
		double n2 = kb.nextDouble();

		switch (op) {
		case '+':
			System.out.print(n1 + " " + op + " " + n2 + " = ");
			System.out.printf("%.2f", (n1 + n2));
			break;
		case '-':
			System.out.print(n1 + " " + op + " " + n2 + " = ");
			System.out.printf("%.2f", (n1 - n2));
			break;
		case '*':
			System.out.print(n1 + " " + op + " " + n2 + " = ");
			System.out.printf("%.2f", (n1 * n2));
			break;
		case '/':
			if (n2 == 0) {
				System.out.println("Cannot divide by zero");
			} else {
				System.out.print(n1 + " " + op + " " + n2 + " = ");
				System.out.printf("%.2f", (n1 / n2));
			}
			break;
		default:
			System.out.println("Invalid operator");
		}

	}

}
