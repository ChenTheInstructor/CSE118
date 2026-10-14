package p3;

import java.util.Scanner;

public class DemoEvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
