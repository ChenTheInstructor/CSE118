package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = getInteger();
		int b = getInteger();
		int sumSquares = getSumSquares(a, b);
		showResult(sumSquares);
	}

	private static void showResult(int sumSquares) {
		System.out.println("The sum of squares is: " + sumSquares);
	}

	private static int getSumSquares(int a, int b) {
		return a * a + b * b;
	}

	private static int getInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		return scanner.nextInt();
	}

}
