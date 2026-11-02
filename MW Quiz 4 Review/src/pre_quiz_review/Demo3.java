package pre_quiz_review;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		
		while(n >= 1) {
			System.out.print(n-- + " ");
		}
		System.out.println("Blast off!");
	}

}
