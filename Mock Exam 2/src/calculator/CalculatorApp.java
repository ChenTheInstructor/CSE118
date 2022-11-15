package calculator;

import java.util.Scanner;

public class CalculatorApp {
	static Scanner scanner = new Scanner(System.in); // class level

	public static void main(String[] args) {
		showMenu();
		int selection = selectOperation();
		double n1 = getOperand1();
		double n2 = getOperand2();
		double result = compute(selection, n1, n2);
		showResult(selection, n1, n2, result);
	}
	
	public static void showResult(int selection, double n1, double n2, double result) {
		System.out.println(n1 + " " + getSymbol(selection) + " " + n2 + " = " + String.format("%5.2f", result));
	}
	
	public static String getSymbol(int selection) {
		switch(selection) {
		case 1: return "+";
		case 2: return "-";
		case 3: return "x";
		case 4: return "/";
		default: return null;
		}
	}

	public static double compute(int selection, double n1, double n2) {
		double result = 0.0;
		switch (selection) {
		case 1:
			result = add(n1, n2);
			break;
		case 2:
			result = subtract(n1, n2);
			break;
		case 3:
			result = multiply(n1, n2);
			break;
		case 4:
			result = divide(n1, n2);
			break;
		}
		return result;
	}

	public static void showMenu() {
		String menuFormat = "%-10s%-10s%n";
		int n = 0;
		System.out.println("\nSelect a number for the operation: ");
		System.out.printf(menuFormat, ++n + ".", "Addition");
		System.out.printf(menuFormat, ++n + ".", "Subtraction");
		System.out.printf(menuFormat, ++n + ".", "Multiplication");
		System.out.printf(menuFormat, ++n + ".", "Division");
		System.out.println("Enter your selection: ");
	}
	
	

	public static int selectOperation() {
//		Scanner scanner = new Scanner(System.in); // local level
		int selection = scanner.nextInt();
		while (selection < 1 || selection > 4) {
			System.out.println("Wrong selection. Enter your selection again: ");
			selection = scanner.nextInt();
		}
		return selection;
	}

	public static double getOperand1() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first operand: ");
		return scanner.nextDouble();
	}

	public static double getOperand2() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the second operand: ");
		return scanner.nextDouble();
	}

	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtract(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiply(double n1, double n2) {
		return n1 * n2;
	}

	public static double divide(double n1, double n2) {
		while(n2 == 0.0) {
//			Scanner scanner = new Scanner(System.in);
			System.out.println("The second operand is 0.0. Enter again: ");
			n2 = scanner.nextDouble();
		}
		return n1 / n2;
	}

}
