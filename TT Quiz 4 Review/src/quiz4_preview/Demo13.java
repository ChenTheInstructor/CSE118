package quiz4_preview;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		for(int i = 0; i < 8; i++) {
			System.out.println("Enter score " + (i + 1) + ": ");
			int score = scanner.nextInt();
			if(score < 0 || score > 100) {
				continue;
			}
			total += score;
		}
		
		
	}

}
