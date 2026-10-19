package p2;

import java.util.Scanner;

public class Demo_Number_Checks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to check: "); // prompt
		int num = input.nextInt();
		
		if(num > 0) {
			System.out.print("Positive, ");
		}
		
		if(num % 2 == 0) {
			System.out.print("Even, ");
		}
		
		if(num % 5 == 0) {
			System.out.print("Mulple of 5");
		}
		
		System.out.println("\nChecks complete.");
	}

}
