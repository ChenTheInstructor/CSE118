package p2_scanner;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// Any class is a reference type
		Scanner scanner = new Scanner(System.in);// created a Scanner object
//		scanner = null;
		// An object may contain data (such Joe or Joey) and methods (functions that perform tasks)
//		System.out.println("Enter your name: "); // print a prompt
//		String name = scanner.nextLine(); // capture everything till encounter the enter key
//		System.out.println("The name entered is: " + name);
//		
//		System.out.println("Enter your age: ");
//		int age = scanner.nextInt();
//		System.out.println("The age entered is: " + age);
		
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		System.out.println("The GPA entered is: " + gpa);
		
		scanner.nextLine(); // to consume the enter key
		
		System.out.println("Enter your name: "); // print a prompt
		String name = scanner.nextLine(); // capture everything till encounter the enter key
		System.out.println("The name entered is: " + name);
		
		
		
		// Fine if goes from getting String to number.
		// It won't work if I go from getting a number to a string
	}

}
