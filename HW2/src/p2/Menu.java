package p2;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Scanner is a class. The hint is the first uppercase letter
		// The purpose of a class is to serve as a template or blueprint for creating objects
		// Objects are used to perform tasks (methods) and store data (fields or instance variables)
		// Objects and instances are used interchangably
		// Objects are usually created by using the "new" operator
		// The purpose of the compiler: transforms source code (based on high-level language like Java) to
		// bytecode (a universal machine code for JVM)
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the restaunt name: ");
		String name = scanner.nextLine();
		System.out.println("Enter the phone: ");
		String phone = scanner.nextLine();
		System.out.println("Enter the name of dish 1: ");
		String dish1 = scanner.nextLine();
		System.out.println("Enter the price of dish 1: ");
		double price1 = scanner.nextDouble();
		count++;
		scanner.nextLine(); // to consume the newline character
		System.out.println("Enter the name of dish 2: ");
		String dish2 = scanner.nextLine();
		System.out.println("Enter the price of dish 2: ");
		double price2 = scanner.nextDouble();
		count++;
		scanner.nextLine(); // to consume the newline character
		System.out.println("Enter the name of dish 3: ");
		String dish3 = scanner.nextLine();
		System.out.println("Enter the price of dish 3: ");
		double price3 = scanner.nextDouble();
		count++;
		
		String fmt = "%-8s%-20S%10.2f%n";
		String dash = "--------------------------------------------------------";
		System.out.println("\t\t  " + name);
		System.out.println("\t\t" + phone);
		System.out.println(dash);
		System.out.printf(fmt, "1.", dish1, price1);
		System.out.printf(fmt, "2.", dish2, price2);
		System.out.printf(fmt, "3.", dish3, price3);
		System.out.println(dash);
		System.out.println("Dish Count: " + count);
		
	}

}
