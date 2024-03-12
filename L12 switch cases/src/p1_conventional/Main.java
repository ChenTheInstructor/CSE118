package p1_conventional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number between 0 and 6");
		double num = scanner.nextDouble();
		String day = "";
		switch (num) {
		case 1.0, 2.0, 3.0, 4.0, 5.0:
			day = "WEEKDAY";
			break;
		case 0.0, 6.0:
			day = "WEEKEND";
			break;
//		case  1:
//			day = "SUNDAY";
//			break; // fall through
//		case 1:
//			day = "MONDAY";
//			break;
//		case 2:
//			day = "TUESDAY";
//			break;
//		case 3:
//			day = "WEDNESDAY";
//			break;
//		case 4:
//			day = "THURSDAY";
//			break;
//		case 5:
//			day = "FRIDAY";
//			break;
//		case 6:
//			day = "SATURDAY";
//			break;
		default:
			System.out.println("No such day in the week.");
		}
		System.out.println(day);

//		String day = "";
//		if (num == 0) {
//			day = "SUNDAY";
//		} else if (num == 1) {
//			day = "MONDAY";
//		} else if (num == 2) {
//			day = "TUESDAY";
//		} else if (num == 3) {
//			day = "WEDNESDAY";
//		} else if (num == 4) {
//			day = "THURSDAY";
//		} else if (num == 5) {
//			day = "FRIDAY";
//		} else if (num == 6) {
//			day = "SATURDAY";
//		} else {
//			System.out.println("No such day in the week.");
//		}
//		System.out.println(day);
	}

}
