package p2_scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// get data into your program in runtime
		// new keyword creates an object of Scanner type
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		
		//output
		System.out.println("Hi " + name + "! You're " + age + " years old. Your GPA is " + gpa);
	}

}
