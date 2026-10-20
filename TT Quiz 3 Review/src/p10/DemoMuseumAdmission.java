package p10;

import java.util.Scanner;

public class DemoMuseumAdmission {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a non-negative integer age and the student status (true/false): ");
		int age = kb.nextInt();
		boolean isStudent = kb.nextBoolean();

		if (age < 0) {
			System.out.println("Invalid age");
		} else if (age < 12) {
			System.out.printf("$%.2f", 6.0);
		} else if (age >= 65) {
			System.out.printf("$%.2f", 8.0);
		} else if (isStudent) {
			System.out.printf("$%.2f", 9.0);
		} else {
			System.out.printf("$%.2f", 14.0);
		}

	}

}
