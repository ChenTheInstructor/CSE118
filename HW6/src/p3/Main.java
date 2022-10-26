package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name, GPA, and major separated by a space: ");
		String name = scanner.next();
		double gpa = scanner.nextDouble();
//		String gpaStr = scanner.next();
//		double gpa = Double.parseDouble(gpaStr);
		String major = scanner.nextLine().trim();
		
		gpa += 1.0; // gpa = gpa + 1.0
		
		if(gpa > 4.0) {
			gpa = 4.0;
		}
		
		System.out.println(name + "\n" + gpa + "\n" + major);
	}

}
