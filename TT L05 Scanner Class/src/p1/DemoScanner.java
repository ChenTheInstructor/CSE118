package p1;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		double age = input.nextDouble();
		
		input.nextLine();// consume the line break left from the previous data
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		
		System.out.println("Hello, " + name + "! You are " + age + " years old.");
	}

}
