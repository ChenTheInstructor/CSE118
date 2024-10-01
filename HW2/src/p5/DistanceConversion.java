package p5;

import java.util.Scanner;

public class DistanceConversion {

	public static void main(String[] args) {
		double miles2KmRatio = 1.60934;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of miles in whole number: ");
		int miles = scanner.nextInt();
		
		// process
		double km = miles * miles2KmRatio;
		
		// output
		System.out.printf("The corresponding km is: %.2f%n", km);
	}

}
