package p16;

import java.util.Scanner;

public class DemoMonthLength {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a month number: ");
		int monthNum = kb.nextInt();

		switch (monthNum) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31 days");
			break;
		case 4, 6, 9, 11:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28 days");
			break;
		default:
			System.out.println("Not a valid month number.");
		}
	}

}
