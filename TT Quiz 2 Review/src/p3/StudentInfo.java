package p3;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// 1 Create a Scanner object
		Scanner input = new Scanner(System.in);
		// Write a prompt
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
//		input.nextLine();
		
		System.out.println("Enter your GPA: ");
		double gpa = input.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.printf("GPA: %.2f%n", gpa);
		System.out.println("Adult Student: " + (age >= 18));
	}

}
