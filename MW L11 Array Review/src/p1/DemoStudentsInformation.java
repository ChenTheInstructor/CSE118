package p1;

import java.util.Scanner;

public class DemoStudentsInformation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		System.out.print("Enter the number of quizzes: ");
		int numQuizzes = input.nextInt();
		input.nextLine();

		String[] names = new String[numStudents];
		int[][] scores = new int[numStudents][numQuizzes];
		double[] averages = new double[numStudents];
		char[] grades = new char[numStudents];

		// input
		for (int i = 0; i < numStudents; i++) {
			System.out.print("\nEnter the name of student " + (i + 1) + ": ");
			names[i] = input.nextLine();
			for (int j = 0; j < numQuizzes; j++) {
				System.out.print("Enter the score of quiz " + (j + 1) + ": ");
				scores[i][j] = input.nextInt();
			}
			input.nextLine();
		}

//		// process
//		for (int i = 0; i < numStudents; i++) {
//			int total = 0;
//			for (int k = 0; k < numQuizzes; k++) {
//				total += scores[i][k];
//			}
//			averages[i] = (double) total / numQuizzes;
//
//			if (averages[i] >= 90) {
//				grades[i] = 'A';
//			} else if (averages[i] >= 80) {
//				grades[i] = 'B';
//			} else if (averages[i] >= 70) {
//				grades[i] = 'C';
//			} else if (averages[i] >= 60) {
//				grades[i] = 'D';
//			} else {
//				grades[i] = 'F';
//			}
//
//		}
		
		process(scores, averages, grades);

//		// output
//		System.out.printf("%-20s", "Name");
//		for (int j = 0; j < numQuizzes; j++) {
//			System.out.printf("%10s", ("Quiz " + (j + 1)));
//		}
//		System.out.printf("%20s", "Average");
//		System.out.printf("%10s%n", "Grade");
//
//		for (int i = 0; i < numStudents; i++) {
//			System.out.printf("%-20s", names[i]);
//			for (int j = 0; j < numQuizzes; j++) {
//				System.out.printf("%10d", scores[i][j]);
//			}
//			System.out.printf("%20.2f", averages[i]);
//			System.out.printf("%10c%n", grades[i]);
//		}
		display(names, scores, averages, grades);
		
		display(names, scores, averages, grades);
	}
	
	public static void display(String[] names, int[][] scores, double[] averages, char[] grades) {
		// output
		int numStudents = names.length;
		int numQuizzes = scores[0].length;
		
		System.out.printf("%-20s", "Name");
		for (int j = 0; j < numQuizzes; j++) {
			System.out.printf("%10s", ("Quiz " + (j + 1)));
		}
		System.out.printf("%20s", "Average");
		System.out.printf("%10s%n", "Grade");

		for (int i = 0; i < numStudents; i++) {
			System.out.printf("%-20s", names[i]);
			for (int j = 0; j < numQuizzes; j++) {
				System.out.printf("%10d", scores[i][j]);
			}
			System.out.printf("%20.2f", averages[i]);
			System.out.printf("%10c%n", grades[i]);
		}
	}
	
	public static void process(int[][] scores, double[] averages, char[] grades) {
		// process
		int numStudents = scores.length;
		int numQuizzes = scores[0].length;
		for (int i = 0; i < numStudents; i++) {
			int total = 0;
			for (int k = 0; k < numQuizzes; k++) {
				total += scores[i][k];
			}
			averages[i] = (double) total / numQuizzes;

			if (averages[i] >= 90) {
				grades[i] = 'A';
			} else if (averages[i] >= 80) {
				grades[i] = 'B';
			} else if (averages[i] >= 70) {
				grades[i] = 'C';
			} else if (averages[i] >= 60) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}

		}
	}
	
}
