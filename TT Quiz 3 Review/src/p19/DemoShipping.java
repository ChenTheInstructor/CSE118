package p19;

import java.util.Scanner;

public class DemoShipping {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a service name: ");
		String name = kb.nextLine();

		double charge = switch (name) {
		case "standard" -> 5.0;
		case "express" -> 12.0;
		case "overnight" -> 20.0;
		default -> -1.0;
		};
		
		System.out.printf("$%.2f", charge);
	}

}
