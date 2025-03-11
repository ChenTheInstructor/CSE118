package p1_simple_one_off_problems;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		double n1 = scanner.nextDouble();
		
		System.out.print("Enter number 2: ");
		double n2 = scanner.nextDouble();
		
		double sum = n1 + n2;
		System.out.println("The sum is: " + sum);
	}

}
