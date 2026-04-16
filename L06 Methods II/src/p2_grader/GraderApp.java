package p2_grader;

import java.util.Scanner;

public class GraderApp {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			grade();
		}

	}

	public static void grade() {
		String name = getName();
		double averageScore = getAverageScore();
		char letterGrade = getLetterGrade(averageScore);
		System.out.printf("%-20s%10.2f%10S%n", name, averageScore, letterGrade);
	}

	public static char getLetterGrade(double score) {
		if (score < 60) {
			return 'F';
		} else if (score < 70) {
			return 'D';
		} else if (score < 80) {
			return 'C';
		} else if (score < 90) {
			return 'B';
		} else {
			return 'A';
		}

	}

	public static double getAverageScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three test scores: ");
		double score1 = scanner.nextDouble();
		double score2 = scanner.nextDouble();
		double score3 = scanner.nextDouble();
		return (score1 + score2 + score3) / 3;
	}

	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a name: ");
		return scanner.nextLine();
	}

}
