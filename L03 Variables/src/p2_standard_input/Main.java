package p2_standard_input;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("The name entered is: " + name);
		
		System.out.println("Enter your age: ");
		int age = keyboard.nextInt();
		System.out.println("The age entered is: " + age);
		
		System.out.println("Enter your GPA: ");
		double gpa = keyboard.nextDouble();
		System.out.println("The GPA entered is: " + gpa);
		
		keyboard.nextLine(); // consume the "enter" key from the previous number
		
		System.out.println("Enter your major: ");
		String major = keyboard.nextLine();
		System.out.println("The major entered is: " + major);
		
	}
	
	

}
