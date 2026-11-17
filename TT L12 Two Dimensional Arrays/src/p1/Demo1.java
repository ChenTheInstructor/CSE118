package p1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();
		System.out.print("Enter the number of quizzes: ");
		int numQuizzes = scanner.nextInt();
		scanner.nextLine();
		
		String[] names = new String[numStudents];
		int[][] scores = new int[numStudents][numQuizzes];
		
		for(int i = 0; i < numStudents; i++) {
			System.out.print("Enter the name of student " + ( i + 1) + ": ");
			names[i] = scanner.nextLine();
			for(int j = 0; j < numQuizzes; j++) {
				System.out.print("Enter the score of quiz " + (j + 1) + ": ");
				scores[i][j] = scanner.nextInt();
			}
			scanner.nextLine();
		}
		
		for(int i = 0; i < numStudents; i++) {
			System.out.print(names[i] + "\t");
			for(int j = 0; j < numQuizzes; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
		char[] letterGrades = new char[numStudents];
		
		System.out.println("-------------------------------------");
		for(int i = 0; i < numStudents; i++) {
			int total = 0;
			for(int j = 0; j < numQuizzes; j++) {
				total += scores[i][j];
			}
			double average = (double)total / numQuizzes;
			char letterGrade;
			if(average >= 90) {
				letterGrade = 'A';
			} else if (average >= 80) {
				letterGrade = 'B';
			} else if (average >= 70) {
				letterGrade = 'C';
			} else if (average >= 60) {
				letterGrade = 'D';
			} else {
				letterGrade = 'F';
			}
			
			letterGrades[i] = letterGrade;
			
			System.out.printf("%-20s%20.2f%10c%n", names[i], average, letterGrades[i]);
		}
	}

}
