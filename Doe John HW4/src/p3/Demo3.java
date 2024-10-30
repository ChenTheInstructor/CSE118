package p3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to convert to Fahrenheit, 2 to Celsius: "); 
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Enter a Celsius degree: ");
			int celsius = scanner.nextInt();
			System.out.println("The Fahrenheit degree: " + ((celsius * 9.0 / 5.0) + 32 ));
//			break;
		case 2:
			System.out.println("Enter a Fahrenheit degree: ");
			int fahrenheit = scanner.nextInt();
			System.out.println("The Celsius degree: " + ((fahrenheit - 32) * 5.0/ 9.0));
//			break;
		default:
			System.out.println("You entered an invalid choice.");
		}
	}

}
