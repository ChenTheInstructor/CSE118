package p6;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer score: ");
		int score = input.nextInt();
		String grade ="Invalid";
		if (score > 100 || score < 0) {
			System.out.println("Invalid Score!");
			
		} else {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
		}
		
		System.out.println(grade);
	}

}
