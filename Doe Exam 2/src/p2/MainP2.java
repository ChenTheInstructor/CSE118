package p2;

import java.util.Scanner;

public class MainP2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		showMenu();
		int choice = getChoice();
		double n = getNumber();
		double result = getResult(n, choice);
		showResult(result);
	}

	public static double getResult(double n, int choice) {
		if (choice == 1) {
			return getSquare(n);
		} else {
			return getSquareRoot(n);
		}
	}

	public static int getChoice() {
		int choice = scanner.nextInt();
		while (choice < 1 || choice > 2) {
			System.out.println("Invalid Choice. Choose again: ");
			choice = scanner.nextInt();
		}
		return choice;
	}

	public static void showMenu() {
		System.out.println("Choose an operation ( 1 or 2): ");
		System.out.printf("\t%-5s%-10s%n", "1.", "Square");
		System.out.printf("\t%-5s%-10s%n", "2.", "Square Root");
		System.out.println("Enter your choice: ");
	}

	private static double getNumber() {
		System.out.println("Enter a number: ");
		return scanner.nextDouble();
	}

	public static double getSquare(double number) {
		return number * number;
	}

	public static double getSquareRoot(double number) {
		return Math.sqrt(number);
	}

	public static void showResult(double number) {
		System.out.printf("The result is: %10.2f%n", number);
	}

}
