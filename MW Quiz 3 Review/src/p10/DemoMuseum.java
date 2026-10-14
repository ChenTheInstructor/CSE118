package p10;

import java.util.Scanner;

public class DemoMuseum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Are you a student (true or false): ");
		boolean isStudent = input.nextBoolean();
		
		if(age < 0) {
			System.out.println("Invalid age.");
		} else if(age < 12) {
			System.out.println("$6.00");
		} else if (age >= 65) {
			System.out.println("$8.00");
		} else {
			if (isStudent) {
				System.out.println("$9.00");
			} else {
				System.out.println("$14.00");
			}
		}
	}

}
