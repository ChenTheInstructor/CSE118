package p4;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int num = getNumber();
		int sumDigits = sumOfDigits(num);
		showResult(sumDigits);
	}

	private static int sumOfDigits(int num) {
		int sum = 0;
		while(num != 0) {
			sum += getLastDigit(num);
			num = num / 10;
		}
		return sum;
	}
	
	private static int getLastDigit(int n) {
		return n % 10;
	}

	private static void showResult(int sum) {
		System.out.println("The sum of digits: " + sum);
	}

	private static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		return scanner.nextInt();
	}

}
