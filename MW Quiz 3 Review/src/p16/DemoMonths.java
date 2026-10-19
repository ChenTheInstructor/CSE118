package p16;

import java.util.Scanner;

public class DemoMonths {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the month number: ");
		int n = kb.nextInt();

		switch (n) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(31);
			break;
		case 4, 6, 9, 11:
			System.out.println(30);
			break;
		case 2:
			System.out.println(28);
			break;
		default:
			System.out.println("Invalid month number!");
		}
	}

}
