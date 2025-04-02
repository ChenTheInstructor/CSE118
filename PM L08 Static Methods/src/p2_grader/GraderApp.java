package p2_grader;

import java.util.Scanner;

public class GraderApp {
// a program converts a test score to letter grade
	public static void main(String[] args) {
		int score = getScore();
		char letterGrade = computeLetterGrade(score);
		System.out.println("Your letter grade is: " + letterGrade);
	}

	private static char computeLetterGrade(int score) {
		if (score >= 90) {
			return 'A';
		}
		if (score >= 80) {
			return 'B';
		}
		if (score >= 70) {
			return 'C';
		}
		if (score >= 60) {
			return 'D';
		}
		return 'F';
	}

	private static int getScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your test score: ");
		return scanner.nextInt();
	}

}
