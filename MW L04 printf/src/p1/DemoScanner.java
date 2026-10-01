package p1;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt
		System.out.println("Enter your name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		System.out.println("Enter your GPA: ");
		double gpa = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Enter your major: ");
		String major = input.nextLine();
		
		System.out.println("Name: " + firstName +"\nAge: " + age + "\nGPA: " + gpa + "\nMajor: " + major);
		System.out.printf("%-20s%5d%10.2f%20S%n", firstName, age, gpa, major);
		
	}

}
