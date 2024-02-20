package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Enter your major: ");
		String major = scanner.nextLine();
		
		System.out.printf("%-20S%10S%10S%10S%n", "name", "age", "gpa", "major");
		System.out.printf("%-20S%10d%10.2f%10S%n", name, age, gpa, major);
		System.out.printf("%-20S%10S%10S%10S%n", "YeaR1", "Year2", "yeaR3", "yEAr4");
		System.out.printf("%-20d%10d%10d%10d%n", age+1, age+2, age+3, age+4);
	}

}
