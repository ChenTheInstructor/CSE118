package p6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String weekdayName = getWeekdayName();
		printResult(weekdayName);
	}

	private static void printResult(String weekdayName) {
		if(weekdayName.equalsIgnoreCase("Monday") 
				|| weekdayName.equalsIgnoreCase("Tuesday")
				|| weekdayName.equalsIgnoreCase("Wednesday") 
				|| weekdayName.equalsIgnoreCase("Thursday")
				|| weekdayName.equalsIgnoreCase("Friday")) {
			System.out.println("It is a weekday!");
		} else if (weekdayName.equalsIgnoreCase("Saturday")
				|| weekdayName.equalsIgnoreCase("Sunday")) {
			System.out.println("It is weekend.");
		} else {
			System.out.println("There is no such weekday name.");
		}
	}

	private static String getWeekdayName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a weekday name: ");
		return scanner.nextLine();
	}

}
