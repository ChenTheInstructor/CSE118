package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1 = getNumber(1);
		int n2 = getNumber(2);
		int n3 = getNumber(3);
		int n4 = getNumber(4);
		int n5 = getNumber(5);

		double average = getAverage(n1, n2, n3, n4, n5);

		showAverage(average);
	}

	private static void showAverage(double average) {
		System.out.printf("The avearge is %.2f.", average);
	}

	private static double getAverage(int n1, int n2, int n3, int n4, int n5) {
		return (double) (n1 + n2 + n3 + n4 + n5) / 5;
	}

	private static int getNumber(int n) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number " + n + ": ");
		return scanner.nextInt();
	}

}
