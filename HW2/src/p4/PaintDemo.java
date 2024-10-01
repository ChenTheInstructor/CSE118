package p4;

import java.util.Scanner;

public class PaintDemo {

	public static void main(String[] args) {
		// input
		int qtsInGallon = 4;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of quarts needed for the job:");
		int totalQts = scanner.nextInt();
		
		//  process
		int gallons = totalQts / qtsInGallon;
		int quarts = totalQts % qtsInGallon;
		
		// output
		System.out.println("Gallon(s): " + gallons);
		System.out.println("Quart(s): " + quarts);
	}

}
