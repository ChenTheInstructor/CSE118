package p3_scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		
		System.out.printf("%10s%10d%10.2f%n", name, age, gpa);
		
	}

}
