package p1;

import java.util.Scanner;

public class Main { // a class is a reference data type

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // creates an object of Scanner type
		// scanner is a variable, representing 8 bytes (64 bites of 1s and 0s) of a memory location
		// Scanner: a reference data type
		// how many bytes the variable scanner uses: 8 bytes (64 bits)
		// what is =? In CS, = is assignment NOT equality
		// new Scanner(System.in)?  creates an object of Scanner type
		// Scanner scanner = new Scanner(System.in); 
		// creates a new object of Scanner type and store its address 
		// at the location called scanner, which is of the Scanner reference type.
		
		System.out.println("Enter your age: "); // print a prompt
		int age = scanner.nextInt(); // captures integer
		scanner.nextLine();
		
		System.out.println("Enter your name: "); // print a prompt
		String name = scanner.nextLine(); // to capture string such as name
		
		
		
		System.out.println("Enter your GPA: "); // print a prompt
		double gpa = scanner.nextDouble(); // captures double
		
		System.out.println(name + ": " + gpa + " " + age);
		System.out.println("The age next year: " + (age + 1));
//		System.out.println(gpa);
//		System.out.println(age);
	}
}
