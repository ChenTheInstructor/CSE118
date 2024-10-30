package p3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		int rows = getNumRows();
		printTriangle(rows);
	}

	
	private static void printTriangle(int rows) {
		for(int i = 1; i <= rows; i++) {
			printRow(i);
		}
	}


	public static void printRow(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	private static int getNumRows() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print: ");
		return scanner.nextInt();
	}

}
