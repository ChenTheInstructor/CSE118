package p2_simple_calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two double numbers and an operator: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		char operator = scanner.next().charAt(0);

//		double result = Double.MAX_VALUE;

		double result = switch (operator) {
		case '+' -> (n1 + n2);
		case '-' -> (n1 - n2);
		case '*' -> (n1 * n2);
		case '/' -> {
			if (n2 == 0) {
				System.out.println("the second number is zero.");
				yield Double.MAX_VALUE;
			} else {
				yield (n1 / n2);
			}
		}
		default -> {
			System.out.println("The operator entered is invalid.");
			yield Double.MAX_VALUE;
		}
		};

		System.out.println(result);

	}

}
