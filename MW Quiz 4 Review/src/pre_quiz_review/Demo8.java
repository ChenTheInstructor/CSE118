package pre_quiz_review;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of scores: ");
		int numScores = scanner.nextInt();
		int totalScore = 0;
		
		for(int i = 0; i < numScores; i++) {
			System.out.println("Enter score " + (i + 1) + ": ");
			totalScore += scanner.nextInt();
		}
		
		System.out.printf("The average score is: %.2f", ((double)totalScore / numScores));
	}

}
