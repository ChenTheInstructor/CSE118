package p3;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weather condition: ");
		String condition = scanner.nextLine();
		System.out.println("Enter the temperature low and high: ");
		int low = scanner.nextInt();
		int high = scanner.nextInt();
		
		// process
		int diff = high - low;
		
		// output
		System.out.println("The weather condition is: " + condition.toUpperCase());
		System.out.println("The difference in temperature is: " + diff);
	}

}
