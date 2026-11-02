package pre_quiz_review;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = scanner.nextInt();
		
		for(int i = n; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.println("We stopped at " + i);
				break;
			}
			if(i == 100) {
				System.out.println("There is no number divisable to 7.");
			}
			
		}
		
		
	}

}
