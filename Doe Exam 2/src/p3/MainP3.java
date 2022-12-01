package p3;

import java.util.Scanner;

public class MainP3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double score = getScore();
		String letterGrade = getGrade(score);
		showLetterGrade(letterGrade);
	}

	private static void showLetterGrade(String letterGrade) {
		System.out.println("The letter grade is: " + letterGrade);
	}

	private static String getGrade(double score) {
		if (score >= 90)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 60)
			return "D";
		else
			return "F";
	}

	private static double getScore() {
		System.out.println("Enter a score: ");
		double score = scanner.nextDouble();
		while (score < 0 || score > 100) {
			System.out.println("Invalid Score. Enter a valid score: ");
			score = scanner.nextDouble();
		}
		return score;

	}

}
