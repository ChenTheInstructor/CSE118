package p2_coding_problems;

import java.util.Scanner;

public class Main5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		System.out.println("You entered: " + number);
		System.out.println("The square root of input: " + Math.sqrt(number));
		System.out.println("The square of the number: " + Math.pow(number, 2));
		System.out.println("The cube of the number: " + Math.pow(number, 3));
	}

}
