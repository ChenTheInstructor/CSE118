package pre_quiz_review;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		
		int total = 0;
		
		for (int i = n; i >= 1; i--) {
			total += i;  // total = total + i;
		}
		
		System.out.println("The total is " + total);
	}

}
