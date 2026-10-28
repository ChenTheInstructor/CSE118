package p2_for_loop;

import java.util.Scanner;

public class DemoCalculateGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students in the class: ");
		int size = input.nextInt();
		double totalScore = 0.0;
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the score of student " + (i+1) +": ");
			double score = input.nextDouble();
			totalScore += score;
		}
		
		System.out.printf("The average score of the class is: %.2f", (totalScore/size));
	}

}
