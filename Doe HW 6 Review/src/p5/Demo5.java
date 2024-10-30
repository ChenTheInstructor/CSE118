package p5;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		int num = getNumber();
		int largestDigit = findLargestDigit(num);
		showResult(largestDigit);
	}

	private static int findLargestDigit(int num) {
		int largest = 0;
		while(num != 0) {
			int digit = num % 10;
			if(digit > largest) {
				largest = digit;
			}
			num /= 10; // num = num / 10;
		}
		return largest;
	}

	private static void showResult(int largestDigit) {
		System.out.println("The largest digit: " + largestDigit);
	}

	private static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		return scanner.nextInt();
	}
}
