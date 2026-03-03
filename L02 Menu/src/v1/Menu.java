package v1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int itemCount = 1;
		System.out.print("Enter the name of the restaurant: "); //prompt
		String name = scanner.nextLine(); // capturing the name
		System.out.print("Enter the phone of the restaurant: "); // prompt
		String phone = scanner.nextLine(); // phone number

		
		
		System.out.println("Enter dish " + (itemCount) + ": "); // prompt for dish 1
		String dish1 = scanner.nextLine();
		System.out.println("Enter dish " + (itemCount++) + " price: "); // prompt for price1
		double price1 = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Enter dish " + (itemCount) + ": ");
		String dish2 = scanner.nextLine();
		System.out.println("Enter dish " + (itemCount++) + " price: ");
		double price2 = scanner.nextDouble();
		
		scanner.nextLine();
		
		
		System.out.println("Enter dish " + (itemCount) + ": ");
		String dish3 = scanner.nextLine();
		System.out.println("Enter dish " + (itemCount++) + " price: ");
		double price3 = scanner.nextDouble();
		
		scanner.nextLine();

		System.out.println("\t" + name);
		System.out.println("\t" + phone);
		System.out.println("--------------------------------------------");
		int item = 1;
		System.out.printf("%-5S%10S%10S\n", "Item", "Dish", "Price");
		System.out.printf("%-5d%10s%10.2f\n", item++, dish1, price1);
		System.out.printf("%-5d%10s%10.2f\n", item++, dish2, price2);
		System.out.printf("%-5d%10s%10.2f\n", item++, dish3, price3);
		

//		System.out.println("Your name is: " + name);
//		System.out.println("Your age is: " + age);
//		System.out.println("Next year your age will be: " + (++age));
//		System.out.println("Your GPA is: " + gpa);

	}

}
