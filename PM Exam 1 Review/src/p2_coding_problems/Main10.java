package p2_coding_problems;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter radius: ");
		double radius = scanner.nextDouble();
//		System.out.printf("Area of circle: %.2f%n", (Math.PI * radius * radius));
		System.out.printf("Area of circle: %.2f\n", (Math.PI * Math.pow(radius, 2)));
	}

}
