package p1;

import java.util.Scanner;

public class Demo_if_statement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature outside: ");
		int temp = input.nextInt();

		if (temp < 32) {
			if (temp < 10) {
				System.out.println("It's really really cold.");
				System.out.println("Make sure you wear something really warm.");
				System.out.println("Or do not go outside!");

			} else {
				System.out.println("It's freezing outside!");
				System.out.println("Make sure you wear a heavy jacket!");
			}
		} else {
			System.out.println("It's not cold outside.");
			System.out.println("You may wear whatever.");
		}
		System.out.println("The temperature outside is " + temp + ". Have a nice day!");
	}
}
