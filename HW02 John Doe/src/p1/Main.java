package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String format = "%3d%20S%10.2f%n";
		String nameFormat = "%25S%n";
		String phoneFormat = "%25S%n";
		String dashLine = "---------------------------------------";

		System.out.println("Enter retaurant name: ");
		String name = scanner.nextLine();

		System.out.println("Enter retaurant phone: ");
		String phone = scanner.nextLine();

		System.out.println("Enter dish 1: ");
		String dish1 = scanner.nextLine();
		System.out.println("Enter the price of dish 1: ");
		double price1 = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter dish 2: ");
		String dish2 = scanner.nextLine();
		System.out.println("Enter the price of dish 2: ");
		double price2 = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter dish 3: ");
		String dish3 = scanner.nextLine();
		System.out.println("Enter the price of dish 3: ");
		double price3 = scanner.nextDouble();

		System.out.printf(nameFormat, name);

		System.out.printf(phoneFormat, phone);

		System.out.println(dashLine);
		int n = 100;
//		System.out.println("n: " + n);
		System.out.printf(format, n++, dish1, price1);
//		System.out.println("n: " + n);
		System.out.printf(format, n++, dish2, price2);
//		System.out.println("n: " + n);
		System.out.printf(format, n++, dish3, price3);
		System.out.println(dashLine);
//		System.out.println("n: " + n);
	}

}
