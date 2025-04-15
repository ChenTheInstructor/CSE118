package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// input
//		int numBooks = getNumberOfItems("books");
//		int numMags = getNumberOfItems("magazines");
		int numBooks = 50; // hard-coded data
		int numMags = 10;
		
		// process
		int totalPages = calcualteTotalPages(numBooks, numMags);
		
		// output
		showResult(totalPages);
		
	}

	private static void showResult(int totalPages) {
		System.out.println("The total number of pages is: " + totalPages +".");
	}

	private static int calcualteTotalPages(int numBooks, int numMags) {
		return (numBooks * 300) + (numMags * 40);
	}

	private static int getNumberOfItems(String string) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of " + string + " you've read this years? ");
		return scanner.nextInt();
	}

}
