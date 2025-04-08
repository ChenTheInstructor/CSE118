package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// like if-else if - else if - else
		int n = getNumber();
		double m = 1.5;
//		convert2(m);
	}
	
	public static void convert2(int n) {
		switch (n) {
		
		case 1, 2, 3, 4, 5: // > 1
			System.out.println("Weekday");
			break;
		case 0, 6:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid number for the week");
		}
	}

	public static void convert(int n) {
		switch (n) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid number for the week");
		}
	}

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 6: ");
		return scanner.nextInt();
	}

}
