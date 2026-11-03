package quiz4_preview;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter integer " + (i + 1) + ": ");
			int n = scanner.nextInt();
			if(n > max) {
				max = n;
			}
		}
		System.out.println("The largest number is: " + max);
	}

}
