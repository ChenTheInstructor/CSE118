package p1_traditional;

import java.util.Scanner;

public class DemoDoubleAndFloat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();

		switch (age) {
		case 10, 11, 12, 13, 14, 15, 16, 17, 18: // each must be a specific value
			System.out.println("You're between 10 and 18 years old.");
			break;
		case 19: // cannot be a range of values
			System.out.println("You're 19 years old.");
			break;
		case 20:
			System.out.println("You're 20 years old.");
			break;
		default:
			System.out.println("You are not 18, 19, or 20 years old.");
		}
		System.out.println("Have a good day!");
	}

}
