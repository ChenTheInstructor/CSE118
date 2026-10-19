package p7;

import java.util.Scanner;

public class Demo_Shipping_Charge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of a package: "); // prompt
		double weight = input.nextDouble();
		
		if (weight <= 0) {
			System.out.println("Invalid");
		} else if(weight <= 2) {
			System.out.printf("$%.2f", 4.5);
		} else if(weight <= 5) {
				System.out.printf("$%.2f", 7.0);
		} else if(weight <= 10) {
			System.out.printf("$%.2f", 10.0);
		} else {
			System.out.println("Cannot ship");
		}
	}

}
