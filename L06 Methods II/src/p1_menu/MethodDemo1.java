package p1_menu;

import java.util.Random;
import java.util.Scanner;

public class MethodDemo1 {

	public static void main(String[] args) {
		createMenu();

	}

	public static void createMenu() {
		String dishName1 = getDishName();
		double dishPrice1 = getRandomPrice(4.99, 10.99); // arguments
		String dishName2 = getDishName();
		double dishPrice2 = getRandomPrice(10.99, 20.99); // arguments
		String dishName3 = getDishName();
		double dishPrice3 = getRandomPrice(30.99, 50.99); // arguments
		showMenu(dishName1, dishPrice1, dishName2, dishPrice2, dishName3, dishPrice3);
	}
	
	public static void showMenu(String dish1, double price1, String dish2, double price2, String dish3, double price3) {
		int itemCount = 0;
		showRestaurantHeader();
		System.out.printf(++itemCount + ". %15S\t%15.2f%n", dish1, ((int)(price1) + .99));
		System.out.printf(++itemCount + ". %15S\t%15.2f%n", dish2, (Math.floor(price2) + .99));
		System.out.printf(++itemCount + ". %15S\t%15.2f%n", dish3, (Math.ceil(price3) + .99));
	}

	public static void showRestaurantHeader() {
		System.out.println("\n\n");
		System.out.println("\tABCDEF Restaurant");
		System.out.println("\t (631) 123-4567");
		System.out.println("-------------------------------------");
	}
	
	public static double getRandomPrice(double min, double max) { // min and max: parameters
		Random rand = new Random();
		double price = rand.nextDouble(min, max);
		return price;
	}

	public static double getRandomPrice() {
		Random rand = new Random();
		double price = rand.nextDouble(9.0, 50.0);
		return price;
	}

	// access modifier
	// static: to allow the main method to use it
	// return data type
	public static String getDishName() { // method header
		// block of code
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a dish name: ");
		String name = scanner.nextLine();
		return name;
	}

	public static double getDishPrice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a dish price: ");
		double price = scanner.nextDouble();
		return price;
	}

}
