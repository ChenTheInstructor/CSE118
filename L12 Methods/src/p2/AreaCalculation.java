package p2;

import java.util.Scanner;

public class AreaCalculation {
	
	public static double getRadius() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		return scanner.nextDouble();
	}
	
	public static double calculateArea(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	public static void showResult(double a) {
		System.out.println("The area is: " + a);
	}
	
	public static void main(String[] args) {
		
		// input
		double radius = getRadius();
		
		// process
		double area = calculateArea(radius);
		
		// output
		showResult(area);
	}
	
//	public static void main(String[] args) {
//		AreaCalculation calc = new AreaCalculation();
//		// input
//		double radius = calc.getRadius();
//		
//		// process
//		double area = calc.calculateArea(radius);
//		
//		// output
//		calc.showResult(area);
//	}

}
