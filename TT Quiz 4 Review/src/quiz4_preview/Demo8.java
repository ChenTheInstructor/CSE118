package quiz4_preview;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many scores you'd like to enter: ");
		int numScores = scanner.nextInt();
		
		int total = 0;
		
		for(int i = 0; i < numScores; i++) {
			System.out.print("Enter score " + (i+1) + ": ");
			int score = scanner.nextInt();
			total += score;
		}
		
		System.out.printf("The average score is %.2f", ((double)total / numScores));
	}

}
