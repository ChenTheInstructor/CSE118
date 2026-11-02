package pre_quiz_review;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		
		while (true) {
			System.out.print("Enter an integer (0 to quit): ");
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			sum += n;
		}
		
		System.out.println("The sum is: " + sum);
	}

}
