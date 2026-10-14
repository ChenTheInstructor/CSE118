package p2;

import java.util.Scanner;

public class DemoNumberChecks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num = input.nextInt();
		
		if(num > 0) {
			System.out.printf("%-15s", "Positive");
		}
		
		if(num % 2 == 0) {
			System.out.printf("%15s","Even");
		}
		
		if(num % 5 == 0) {
			System.out.printf("%15s","Multiple of 5.");
		}
	}

}
