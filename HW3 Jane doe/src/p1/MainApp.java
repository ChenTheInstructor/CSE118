package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
//		MainApp myMain;
//		int x = 10;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of miles as a whole number: ");
		int miles = scanner.nextInt();
		double kilometers = (miles * 1.60934);
		System.out.printf("The kilometers: %.2f", kilometers);
//		System.out.printf("The kilometers: " + Math.round(kilometers));
		
		
//		scanner.nextLine();
//		System.out.println("Enter your age: ");
//		double age = scanner.nextDouble();
//		scanner.nextLine();
		
	}

}
