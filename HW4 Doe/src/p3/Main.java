package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a score: ");
		double score = scanner.nextDouble();
		String letterGrade = null;
		if(score >= 0.0 && score <= 100.0) {
			if(score >= 90) {
				letterGrade = "A";
			} else if(score >= 80) {
				letterGrade = "B";
			} else if(score >= 70) {
				letterGrade = "C";
			} else if (score >= 60) {
				letterGrade = "D";
			} else {
				letterGrade = "F";
			}
		} else {
			System.out.println("You entered an invalid score.");
		}
		
		if(letterGrade != null) {
			System.out.println("The letter grade is: " + letterGrade);
		}
		
//		if(90 <= score <= 100) // not this
//		if(score >= 90 && score <= 100) // this is correct
	}

}
