package p3;

import java.util.Arrays;
import java.util.Scanner;

public class DemoQuizPreview {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask for the number of scores
		System.out.print("Enter the number of scores: ");
		int numScores = input.nextInt();

		// ask, read, and store each score
		int[] scores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			System.out.print("\nEnter score " + (i + 1) + ": ");
			scores[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(scores));
		// calculate the average
		int totalScore = 0;
		for (int score : scores) {
			totalScore += score;
		}

		double average = (double) totalScore / numScores;
		
		// find the highest and lowest score
		int highest = scores[0]; // assume the first score is the highest score
		int lowest = scores[0];
		
		for(int i = 1; i < scores.length; i++) {
			if(scores[i] > highest) {
				highest = scores[i];
			}
			if(scores[i] < lowest) {
				lowest = scores[i];
			}
		}
		

		// display the average, the lowest and highest scores

		System.out.printf("The average is: %.2f%n", average);
		System.out.println("The highest score: " + highest);
		System.out.println("The lowest score: " + lowest);
	}

}
