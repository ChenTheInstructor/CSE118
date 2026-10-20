package p18;

import java.util.Scanner;

public class DemoWeekDayCategory {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a week day number 1 through 7: ");
		int num = kb.nextInt();

		String category = switch (num) {
		case 1, 2, 3, 4, 5 -> "Weekday";
		case 6, 7 -> "Weekend";
		default -> "Invalid week day number";
		};
		
		System.out.println(category);
	}

}
