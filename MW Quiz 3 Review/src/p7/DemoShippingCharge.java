package p7;

import java.util.Scanner;

public class DemoShippingCharge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();
		double cost = 0.0;
		
		if(weight <= 0) {
			System.out.println("Invalid");
		} else if(weight <= 2) {
			cost = 4.50;
		} else if(weight <= 5) {
			cost = 7.0;
		} else if(weight <= 10) {
			cost = 10.0;
		} else {
			System.out.println("Cannot be shipped.");
		}
		System.out.printf("$%.2f", cost);
	}

}
