package p4;

import java.util.Scanner;

public class MainLeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		boolean isLeapYear = false;
		
		if(year % 4 == 0 && year % 100 != 0) {
			isLeapYear = true;
		} else if(year % 400 == 0) {
			isLeapYear = true;
		}
		
		
		if(isLeapYear) {
			System.out.println("The year entered is a leap year.");
		} else {
			System.out.println("The year entered is not a leap year.");
		}
	}

}
