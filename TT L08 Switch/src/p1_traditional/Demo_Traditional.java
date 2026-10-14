package p1_traditional;

import java.util.Scanner;

public class Demo_Traditional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your letter grade: ");
		String grade = input.nextLine();

		switch (grade) {
		case "A":
			System.out.println("90 or higher");
			System.out.println("Excellent job!");
			break; // fall through
		case "B":
			System.out.println("between 80 and 90");
			System.out.println("Good job!");
			break;
		case "C":
			System.out.println("between 70 and 80");
			System.out.println("Not bad.");
			break;
		case "D":
			System.out.println("between 60 and 70");
			System.out.println("Need more work");
			break;
		case "F":
			System.out.println("below 60");
			System.out.println("You're in danger failing the class.");
			break;
		default: // catch all
			System.out.println("No such letter grade.");
		}

		System.out.println("Have a nice day!");
	}

}
