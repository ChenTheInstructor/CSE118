package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// input
		int n1 = getScore(1);
		int n2 = getScore(2);
		int n3 = getScore(3);
		int n4 = getScore(4);
		int n5 = getScore(5);
		
		// process
		double average = calculateAverage(n1, n2, n3, n4, n5);
		
		// output
		showAverage(average);
	}

	private static void showAverage(double average) {
//		System.out.printf("The average is %.2f.", average);
		System.out.println("The average is " + String.format("%.2f", average) + ".");
	}

	private static double calculateAverage(int n1, int n2, int n3, int n4, int n5) {
		return (n1 + n2 + n3 + n4 + n5)  / 5.0;
	}

	private static int getScore(int i) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter score " + i +": ");
		return scanner.nextInt();
	}

}
