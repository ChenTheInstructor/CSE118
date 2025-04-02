package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number1 = getNumber();
		System.out.println(convert2(number1));// number is called argument
//		int number2 = getNumber();
//		convert(number2);// number is called argument
//		
//		int number3 = 3;
//		convert(number3);
	}
	// only the content of the argument gets passed to the parameter.
	// Not the name of the argument gets passed.

	// In other words, arguments are passed to the method by their values not by
	// their names
	// The only thing that matters is that the type of the argument and the
	// parameter has to match.
	public static String convert(int n) { // int n is parameter
		String day;
		switch (n) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
			day = "No such day!";
		}

		return day;
	}

	public static String convert2(int n) { // int n is parameter
		return switch (n) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "No such day!";
		};

	}

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 6, inclusive: ");
		return scanner.nextInt();
	}

}
