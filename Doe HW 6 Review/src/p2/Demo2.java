package p2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int n = getNumber(); // main is caller, getNumber is a callee
		int oddSum = sumOfOddNumbers(n);
		showResult(oddSum);
	}

	private static void showResult(int oddSum) {
		System.out.println("The sum of odd numbers is: " + oddSum);
	}

	private static int sumOfOddNumbers(int num) {
		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			if(i % 2 == 1) {
//				sum += i;
//			}
//		}

		for (int i = 1; i <= num; i = i + 2) {
			sum += i;
		}
		return sum;
	}

	private static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return scanner.nextInt();
	}

}
