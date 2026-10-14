package p1;

import java.util.Scanner;

public class DemoSwitchModern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// created a Scanner object
		System.out.print("Enter your letter grade: "); // prompt
		char grade = input.nextLine().toUpperCase().charAt(0);

		String comment = switch (grade) { // String, char, int, short, long, byte, boolean, not double, float
		case 'A'-> "90 or higher. Good job!";
		case 'B'-> "Between 80 and 90. Pretty good!";
		case 'C'-> "between 70 and 80. Not bad!";
		case 'D'-> {
			System.out.println("You are in danger.");
			System.out.println("Come to see me after class.");
			yield "Between 60 and 70. Try harder next time.";
		}
		case 'F'-> "Below 60. Need more work.";
		default -> "This is not a valid grade. Sorry!";
		};
		System.out.println(comment);
	}

}
