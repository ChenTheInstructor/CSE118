package p3_example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double radius = scanner.nextDouble();
		double area = radius * radius * Math.PI;
		System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
	}

}
