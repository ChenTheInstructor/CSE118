package p17;

import java.util.Scanner;

public class DemoMenu {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a menu item number: ");
		int num = kb.nextInt();
		
		switch(num) {
		case 1 -> System.out.println("View Balance");
		case 2 -> System.out.println("Deposit");
		case 3 -> System.out.println("Withdraw");
		case 4 -> System.out.println("Exit");
		default -> System.out.println("Invalid menu item number");
		}
	}

}
