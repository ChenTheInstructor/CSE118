package quiz4_preview;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Enter integer " + (i + 1) + ": ");
			int n = scanner.nextInt();
			if(n > 0) {
				positiveCount++;
			} else if (n < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
		}
		
		System.out.println("Positive Count: " + positiveCount);
		System.out.println("Negative Count: " + negativeCount);
		System.out.println("Zero Count: " + zeroCount);
	}

}
