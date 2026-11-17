package p2;

import java.util.Scanner;

public class DemoStudentClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();
		System.out.print("Enter the number of quizzes: ");
		int numQuizzes = scanner.nextInt();
		scanner.nextLine();
		
		String[] names = new String[numStudents];
		int[][] scores = new int[numStudents][numQuizzes];
		double[] averages = new double[numStudents];
		char[] grades = new char[numStudents];
		
		for(int i = 0; i < numStudents; i++) { // each student per iteration
			System.out.print("Enter the name of student " + (i + 1) + ": ");
			names[i] = scanner.nextLine();
			int total = 0;
			for(int j = 0; j < numQuizzes; j++) {
				System.out.print("Enter the score of quiz " + (j + 1) + ": ");
				scores[i][j] = scanner.nextInt();
				total += scores[i][j];
			}
			scanner.nextLine();
			averages[i] = (double) total / numQuizzes;
			
			if(averages[i] >= 90) {
				grades[i] = 'A';
			} else if(averages[i] >= 80) {
				grades[i] = 'B';
			}  else if(averages[i] >= 70) {
				grades[i] = 'C';
			}  else if(averages[i] >= 60) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}
		}
		System.out.println("\nThese are the final results: ");
		System.out.println("_______________________________________");
		
		for(int i = 0; i < numStudents; i++) {
			System.out.printf("%-20s", names[i]);
			for(int j = 0; j < numQuizzes; j++) {
				System.out.printf("%10d", scores[i][j]);
			}
			System.out.printf("%10.2f", averages[i]);
			System.out.printf("%10c%n", grades[i]);
		}
		
	}

}
