package p3;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		input.nextLine();
		
		System.out.print("Enter your major: ");
		String major = input.nextLine();
		
		
		System.out.printf("%-20s%10d%20s%n", name, age, major);
		
	}
}
