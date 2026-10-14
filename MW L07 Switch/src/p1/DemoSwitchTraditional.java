package p1;

import java.util.Scanner;

public class DemoSwitchTraditional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// created a Scanner object
		System.out.print("Enter your letter grade: "); // prompt
		String grade = input.nextLine().toUpperCase();

		switch (grade) { // String, char, int, short, long, byte, boolean, not double, float
		case "A":
			System.out.println("90 or higher.");
			System.out.println("Good job!");
			break;
		case "B":
			System.out.println("Between 80 and 90.");
			System.out.println("Pretty good!");
			break;
		case "C":
			System.out.println("Between 70 and 80.");
			System.out.println("Not bad!");
			break;
		case "D":
			System.out.println("Between 60 and 70.");
			System.out.println("Be careful!");
			break;
		case "F":
			System.out.println("Below 60.");
			System.out.println("Need more work");
			break;
//		default: // catch all
//			System.out.println("This is not a valid grade.");
//			System.out.println("Sorry!");
////			break;
		}
	}

}
