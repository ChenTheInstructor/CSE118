package p3;

import java.util.Scanner;

public class GradingApp {

	public static void main(String[] args) {
		int score = getTestScore();
		String letterGrade = convert2LetterGrade(score);
		System.out.println("Your letter grade is: " + letterGrade);
	}

	private static String convert2LetterGrade(int score) {
		String letterGrade;
		if(score >= 90) {
			letterGrade = "A";
		}
		else if(score >= 80) {
			letterGrade =  "B";
		}
		else if(score >= 70) {
			letterGrade = "C";
		}
		else if(score >= 60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}

	private static int getTestScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your test score: ");
		return scanner.nextInt();
	}

}
