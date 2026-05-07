package p1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
	private static Scanner scanner = new Scanner(System.in);
	private static String[] dishes;
	private static double[] prices;
	private static int nDishes = 3;
	private static String restaurantName = "ABCDEF CAFE";
	private static String restaurantPhone = "(631) 123-4567";
	private static int[][] orders;
	private int orderCount = nDishes;

	public static void main(String[] args) {
		buildMenu();
		getOrders();
		showOrders();
	}

	public static void getOrders() {
		orders = new int[nDishes][2];
		int order = 0;
		do {
			showMenu();
			orders[order] = getOrder();
			if (orders[order][0] == 0) {
				break;
			} 
			order++;
		} while (true);
		orders = Arrays.copyOf(orders, order);
	}
	
	public static void showOrders() {
		for(int i = 0; i < orders.length; i++) {
			System.out.printf("\n%-10s%10d%10.2f%n",dishes[orders[i][0]], orders[i][1], orders[i][1] * prices[orders[i][0]]);
		}
	}

	public static int[] getOrder() {
		int[] order = new int[2];
		System.out.print("Which dish would you like to order (enter dish number or 0 to quit)? ");
		order[0] = scanner.nextInt();
		if (order[0] == 0) {
			return order;
		}
		System.out.println("How many orders for the dish?");
		order[1] = scanner.nextInt();
		return order;
	}

	public static void buildMenu() {
		getDishes();
		getPrices();
	}

	public static void showMenu() {
		showMenuHeader();
		showDishesAndPrices();
	}

	public static void showDishesAndPrices() {
		String dashes = "----------------------------------------------";
		System.out.println(dashes);
		for (int i = 0; i < nDishes; i++) {
			System.out.printf("%-5d%-15s%10.2f%n", (i + 1), dishes[i], prices[i]);
		}
		System.out.println(dashes);
	}

	public static void showRestaurantName(String name) {
		System.out.println("\t" + name);
	}

	public static void showRestaurantPhone(String phone) {
		System.out.println("\t" + phone);
	}

	public static void showMenuHeader() {
		showRestaurantName(restaurantName);
		showRestaurantPhone(restaurantPhone);
	}

	public static void getDishes() {
		dishes = new String[nDishes];
		for (int i = 0; i < nDishes; i++) {
			System.out.print("Enter the name of dish " + (i + 1) + ": ");
			dishes[i] = scanner.nextLine();
		}
	}

	public static void getPrices() {
		prices = new double[nDishes];
		for (int i = 0; i < nDishes; i++) {
			System.out.print("Enter the price of dish " + (i + 1) + ": ");
			prices[i] = scanner.nextDouble();
		}
	}

}
