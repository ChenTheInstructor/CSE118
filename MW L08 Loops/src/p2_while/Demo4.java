package p2_while;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price = 0;
		double total = 0;

		do {
			System.out.print("Enter a price or 0 to end: ");
			price = input.nextDouble();
			total += price;
			if (price == 0) {
				break;
			}
		} while (true);

//		do {
//			System.out.print("Enter a price or 0 to end: ");
//			price = input.nextDouble();
//			total += price;
//		} while(price != 0);

		System.out.printf("The total is: %.2f", total);

//		while(price != 0) {
//			System.out.print("Enter a price or 0 to end: ");
//			price = input.nextDouble();
//			total += price;
//		}
//		System.out.printf("The total is: %.2f", total);
	}

}
