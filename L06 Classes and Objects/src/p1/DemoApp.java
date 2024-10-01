package p1;

import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int n1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = scanner.nextInt();
		System.out.println("Enter number 3: ");
		int n3 = scanner.nextInt();
		
		// process
		double average = (n1 + n2 + n3) / 3.0;
		
		// Output
		System.out.println("The average is: " + average);
		
	}

}
