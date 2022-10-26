package p6_scanner;

import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// request a number
		System.out.println("Enter a number: ");
		double num = scanner.nextDouble();

		scanner.nextLine(); // consume the enter key
		
		// request a string
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();

		System.out.println(str + "\t" + num);
	}

}
