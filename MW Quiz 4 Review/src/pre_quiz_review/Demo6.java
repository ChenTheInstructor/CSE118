package pre_quiz_review;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int positives = 0;
		int negatives = 0;
		int zeros = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter an integer: ");

			int n = scanner.nextInt();
			if (n > 0) {
				positives++;
			} else if (n < 0) {
				negatives++;
			} else {
				zeros++;
			}

		}
		System.out.println("This is the tally: ");
		System.out.println("Number of Positives: " + positives);
		System.out.println("Number of Negatives: " + negatives);
		System.out.println("Number of Zeros: " + zeros);
		
	}

}
