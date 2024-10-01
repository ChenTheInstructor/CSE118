package p6;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your GPA: "); 
		double gpa = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter your major: ");
		String major = scanner.nextLine();
		System.out.println("Name\t\tGPA\t\tMajor" );
		System.out.println(name +"\t\t" + gpa +"\t\t" + major);
		
		
	}

}
