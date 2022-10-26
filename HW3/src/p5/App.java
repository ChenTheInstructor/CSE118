package p5;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// input
//		Scanner scanner;
//		scanner = new Scanner(System.in);
		
		final double DOZEN_PRICE = 3.25;
		final double LOOSE_EGG_PRICE = 0.45;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of eggs: ");
		int numberOfEggs = scanner.nextInt();
		
		
		// process data
//		DOZEN_PRICE = 10.99;
		int numberOfDozens = numberOfEggs/12;
		int numberOfLooseEggs = numberOfEggs - numberOfDozens * 12;
		double costOfDozens = numberOfDozens * DOZEN_PRICE;
		double costOfLooseEggs = numberOfLooseEggs * LOOSE_EGG_PRICE;
		double totalCost = costOfDozens + costOfLooseEggs;
		
		// output
		
		System.out.print("You ordered " + numberOfEggs + " eggs.");
		System.out.print(" That is " + numberOfDozens + " dozens at ");
		System.out.print(DOZEN_PRICE +  " per dozen and ");
		System.out.print(numberOfLooseEggs + " loose eggs at ");
		System.out.print(LOOSE_EGG_PRICE + " each for a total of $");
		System.out.println(String.format("%4.2f", totalCost) +".");
	}
}
