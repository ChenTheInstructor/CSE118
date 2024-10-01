package p1_string;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		String formatDash = "%13s%n";
		String formatData = "%-4.2f%9S\n";
		String dash = "------------";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name 1: ");
		String name1 = scanner.nextLine();
		System.out.println("Enter name 2: ");
		String name2 = scanner.nextLine();
		System.out.println("Enter GPA 1: ");
		double gpa1 = scanner.nextDouble();
		System.out.println("Enter GPA 2: ");
		double gpa2 = scanner.nextDouble();
		
		System.out.println("How much would you like to curve the GPA: ");
		double curve = scanner.nextDouble();
		
		System.out.println("Here is your display: ");
		
//		System.out.print("hi bye feafewa fsda \n fafdsa ff\n dsafdaf da\nfafa \n\n\n gfdagfda");
		System.out.printf(formatDash, dash);
		System.out.printf(formatData, (gpa1 + curve), name1);
		System.out.printf(formatDash, dash);
		System.out.printf(formatData, (gpa2 + curve), name2);
		System.out.printf(formatDash, dash);
	}
}
