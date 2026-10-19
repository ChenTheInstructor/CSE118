package p19;

import java.util.Scanner;

public class DemoShippingCharges {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a service name (standard, express, or overnight): ");
		String name = scanner.nextLine();
		
		double charge = switch(name) {
		case "standard" -> 5.00;
		case "express" -> 12.00;
		case "overnight" -> 20.00;
		default -> -1;
		};
		
		if(charge == -1.0) {
			System.out.println("Invalid Service");
		} else {
			System.out.printf("The shipping charge is: $%.2f", charge);
		}
	}

}
