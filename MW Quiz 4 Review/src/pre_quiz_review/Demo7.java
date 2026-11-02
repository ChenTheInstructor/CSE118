package pre_quiz_review;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		System.out.println("The smallest integer  possible in Java is: " + max);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an integer: ");
			int n = scanner.nextInt();
			if (n > max) {
				max = n;
			}
		}
		System.out.println("The largest value is: " + max);
	}

}
