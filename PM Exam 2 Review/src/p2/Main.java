package p2;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int numBooks = getNumber("books");
		int numMags = getNumber("magazines");

		int totalPages = getTotalPages(numBooks, numMags);

		showResult(totalPages);
	}

	private static void showResult(int totalPages) {
		System.out.println("The number of total pages you have read this years: " + totalPages + ".");
	}

	private static int getTotalPages(int numBooks, int numMags) {
		return (numBooks * 300) + (numMags * 40);
	}

	private static int getNumber(String string) {
		System.out.println("How many " + string + " have you read this years? ");
		return scanner.nextInt();
	}

}
