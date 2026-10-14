package p2_if_else;

import java.util.Scanner;

public class Demo_if_else {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature outside: ");
		int temp = input.nextInt();

//		if (temp < 32) {
//			if (temp < 10) {
//				System.out.println("It's really really cold!");
//			} else {
//				System.out.println("Freezing, but not that bad.");
//				System.out.println("Wear a heavy jacket.");
//			}
//		} 
		if (temp < 10) {
			System.out.println("It's really really cold!");
		} else if (temp < 32) {
			System.out.println("Freezing, but not that bad.");
			System.out.println("Wear a heavy jacket.");
		} else if(temp < 90) {
			System.out.println("Seems to be nice outside.");
			System.out.println("Wear whatever.");
		} else {
			System.out.println("Too hot!");
		}

		System.out.println("Enjoy your day!");
	}

}
