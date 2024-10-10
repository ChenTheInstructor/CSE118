package p2_if;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a test score: ");
			int s = scanner.nextInt();
			char grade = ' '; // empty char
			if (s >= 90) {
				grade = 'A';
			} else if (s >= 80) {
				grade = 'B';
			} else if (s >= 70) {
				grade = 'C';
			} else if (s >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("The letter grade is: " + grade);

			System.out.println("Continue? (y or n)");
			scanner.nextLine();
			char reply = scanner.nextLine().charAt(0);
			if (reply != 'y' && reply != 'Y') {
				break;
			}

		}
		System.out.println("End");
	}

}
