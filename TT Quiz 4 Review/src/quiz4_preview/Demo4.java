package quiz4_preview;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		int total = 0; // accumulator for the running sum
		for(int i = n; i >= 1; i--) {
			total = total + i;
		}
		System.out.println("The total is " + total);
	}

}
