package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String day = getDayAsString().toLowerCase();
		
		switch(day) {
		case "monday", "tuesday", "wednesday", "thursday", "friday":
			System.out.println("It's a weekday!");
			break;
		case "saturday", "sunday":
			System.out.println("It's weekend!");
			break;
		default:
			System.out.println("No such day in a week!");	
		}
		
	}
	
	public static String getDayAsString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day of the week: ");
		return scanner.nextLine();
	}

}
