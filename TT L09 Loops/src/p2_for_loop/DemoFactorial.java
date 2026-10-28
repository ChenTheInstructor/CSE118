package p2_for_loop;

import java.util.Scanner;

public class DemoFactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		long factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of " + n + " is " + factorial);
	}

}
