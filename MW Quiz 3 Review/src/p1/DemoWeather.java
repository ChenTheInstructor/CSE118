package p1;

import java.util.Scanner;

public class DemoWeather {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in Fahrenheit: ");
		int temp = input.nextInt();
		
		if(temp < 50) {
			System.out.println("Wear a warm coat.");
		}
		
		System.out.println("Have a good day!");
	}

}
