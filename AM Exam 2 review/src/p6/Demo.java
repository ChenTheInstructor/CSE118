package p6;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String weekdayName = getNameOfWeekday();
		decide(weekdayName);
	}

	private static void decide(String weekdayName) {
		if (weekdayName.equalsIgnoreCase("Monday") 
				|| weekdayName.equalsIgnoreCase("Tuesday")
				|| weekdayName.equalsIgnoreCase("Wednesday") 
				|| weekdayName.equalsIgnoreCase("Thursday")
				|| weekdayName.equalsIgnoreCase("Friday")) {
			System.out.println("Weekday!");
		} else if (weekdayName.equalsIgnoreCase("Saturday") 
				|| weekdayName.equalsIgnoreCase("Sunday")) {
			System.out.println("It's weekend.");
		} else {
			System.out.println("No such weekday name.");
		}

	}

	private static String getNameOfWeekday() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the weekday: ");
		return scanner.nextLine();
	}

}
