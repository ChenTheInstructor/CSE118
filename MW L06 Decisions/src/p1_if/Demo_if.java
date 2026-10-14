package p1_if;

import java.util.Scanner;

public class Demo_if {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature outside: ");
		int temp = input.nextInt();
		
		if(temp < 32) {
			System.out.println("Freezing!");
			System.out.println("Wear a heavy jacket.");
		}
		
		System.out.println("Enjoy your day!");
	}

}
