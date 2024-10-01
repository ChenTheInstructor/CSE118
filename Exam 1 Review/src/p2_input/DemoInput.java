package p2_input;

import java.util.Scanner;

public class DemoInput {
	/* Two ways to get input
	 * a. hard-code the input; Provide data directly at coding time
	 * b. get data from the user at runtime.
	 */

	public static void main(String[] args) {
		// hard code input
		int age = 20;
		String name = "John";
		double pi = Math.PI;
		System.out.println(pi); 
		
		// get data at runtime
		// A class is a reference data type, used to declare a reference variable
//		Scanner scanner; // declare a reference variable. Must do so first time using a new variable
//		String major;
//		scanner = new Scanner(System.in);
//		major = new String("Jane");
		Scanner scanner = new Scanner(System.in);
//		String major = new String("CS");
		// create a prompt
//		System.out.println("Enter your last name, age, and GPA: ");
//		String lastName = scanner.next();
//		int userAge = scanner.nextInt();
//		double userGpa = scanner.nextDouble();
//		System.out.println("The name entered is: " + lastName + ", " + userAge + ", " + userGpa );
		
		// if using scanner.nextLine() to capture a string and if you transition 
		// from getting a number to such a string, you need to consume the extra 
		// newline character
		
		System.out.println("Enter your age: ");
		int userAge = scanner.nextInt();
//		scanner.nextLine();
		System.out.println("Enter your name: ");
		String userName = scanner.nextLine();
		
		System.out.println("Name: " + userName + ": " + "Age: " + userAge);
	}

}
