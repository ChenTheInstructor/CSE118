package p18;

import java.util.Scanner;

public class DemoDayCategory {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a dayt number: ");
		int n = kb.nextInt();

		String category = switch (n) {
		case 1, 2, 3, 4, 5 -> "Weekday";
		case 6, 7 -> "Weekend";
		default -> "Invalid Day";
		};

		System.out.println(category);
	}

}
