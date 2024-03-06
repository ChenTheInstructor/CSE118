package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double n = scanner.nextDouble();
		
		if(n > 0) {
			System.out.println("It's positive.");
		} else if(n < 0) {
			System.out.println("It's negative.");
		} else {
			System.out.println("It's zero!");
		}
	}

}
