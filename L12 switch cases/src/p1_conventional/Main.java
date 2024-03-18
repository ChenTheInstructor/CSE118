package p1_conventional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();
		char initial = name.charAt(0);
		String gender = "";
		
		switch (initial) {
		case 'J', 'A':
//			gender = "Male";
			System.out.println("The first initial is either J or A");
			break;
		case 'L', 'S':
//			gender = "Female";
			System.out.println("The first initial is either L or S");
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
			System.out.println("I got something else.");
		}
		System.out.println(gender);

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
