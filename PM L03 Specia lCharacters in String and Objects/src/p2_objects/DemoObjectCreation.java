package p2_objects;

import java.util.Scanner;

public class DemoObjectCreation {

	public static void main(String[] args) {
		// String is a class. A class is a data type.
		String name = "Joey"; // similar to int age = 18;
		// object has methods
		System.out.println(name.length());
		// A class is a template (blue print) used to create objects

		// similarly
		// Scanner is a class. Scanner therefore is a data type.
		// Scanner is a template (blue print) used to create Scanner objects
		Scanner scanner = new Scanner(System.in);// constructor
		System.out.println("Enter your name: ");
		System.out.println(scanner.nextLine());

	}

}
