package p19;

import java.util.Scanner;

public class DemoShippingCharges {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a service name (standard, express, or overnight): ");
		String name = scanner.nextLine();

		double charge = switch (name) {
		case "standard" -> {
			double cost = 5.00;
			System.out.println("Would you like to purchase insurance? ");
			char reply = scanner.nextLine().toUpperCase().charAt(0);
			if (reply == 'Y') {
				cost += 20;
				cost *= 1.0875;
			}
			yield cost;
		}
		case "express" -> 12.00;
		case "overnight" -> 20.00;
		default -> -1;
		};

		if (charge == -1.0) {
			System.out.println("Invalid Service");
		} else {
			System.out.printf("The shipping charge is: $%.2f", charge);
		}
	}

}
