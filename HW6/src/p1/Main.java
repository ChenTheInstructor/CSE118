package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scanner.nextInt();
		if(num % 2 == 0) {
			System.out.println("It is an even number.");
		} else {
			System.out.println("It's an odd number.");
		}
	}

}
