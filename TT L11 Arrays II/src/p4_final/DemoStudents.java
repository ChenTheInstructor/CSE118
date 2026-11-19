package p4_final;

import java.util.Scanner;

public class DemoStudents {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// input
		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();
		System.out.print("Enter the number of quizzes: ");
		int numQuizzes = scanner.nextInt();
		scanner.nextLine();

		String[] names = new String[numStudents];
		int[][] scores = new int[numStudents][numQuizzes];
		double[] averages = new double[numStudents];
		char[] grades = new char[numStudents];

		getStudentData(names, scores);

		// process
		// calculate and store averages
		calculateAverages(scores, averages);

		// calculate and store letter grades
		calculateLetterGrades(averages, grades);

		// output
		display(names, scores, averages, grades);// arguments
		
		display(names, scores, averages, grades);

	}
	
	public static void calculateAverages(int[][] scores, double[] averages) {
		int numStudents = scores.length;
		int numQuizzes = scores[0].length;
		
		for (int i = 0; i < numStudents; i++) {
			int total = 0;
			for (int j = 0; j < numQuizzes; j++) {
				total += scores[i][j];
			}
			averages[i] = (double) total / numQuizzes;
		}
	}
	
	public static void getStudentData(String[] names, int[][] scores) {
		Scanner scanner = new Scanner(System.in);
		int numStudents = names.length;
		int numQuizzes = scores[0].length;
		
		for (int i = 0; i < numStudents; i++) { // each student per iteration
			System.out.print("\nEnter the name of student " + (i + 1) + ": ");
			names[i] = scanner.nextLine();
			for (int j = 0; j < numQuizzes; j++) {
				System.out.print("Enter the score of quiz " + (j + 1) + ": ");
				scores[i][j] = scanner.nextInt();
			}
			scanner.nextLine();
		}
	}
	
	public static void calculateLetterGrades(double[] aver, char[] letterGrades) {
		int numStudents = aver.length;
		
		for (int i = 0; i < numStudents; i++) {
			if (aver[i] >= 90) {
				letterGrades[i] = 'A';
			} else if (aver[i] >= 80) {
				letterGrades[i] = 'B';
			} else if (aver[i] >= 70) {
				letterGrades[i] = 'C';
			} else if (aver[i] >= 60) {
				letterGrades[i] = 'D';
			} else {
				letterGrades[i] = 'F';
			}
		}
	}
	// parameters
	public static void display(String[] names, int[][] scores, double[] averages, char[] grades) {
		int numStudents = names.length;
		int numQuizzes = scores[0].length;
		
		System.out.println("\nThese are the results:");

		// print column headings
		System.out.printf("%n%-20S", "name");

		for (int k = 0; k < numQuizzes; k++) {
			System.out.printf("%10S", ("Quiz " + (k + 1)));
		}

		System.out.printf("%20S", "Average");
		System.out.printf("%10S%n", "Grades");

		for (int i = 0; i < numStudents; i++) { // nested for-loop
			System.out.printf("%-20s", names[i]);
			for (int j = 0; j < numQuizzes; j++) {
				System.out.printf("%10d", scores[i][j]);
			}
			System.out.printf("%20.2f", averages[i]);
			System.out.printf("%10c%n", grades[i]);
		}
	}

}
