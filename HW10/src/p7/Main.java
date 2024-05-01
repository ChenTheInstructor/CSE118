package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double weight = getValue("weight");
		double height = getValue("height");
		double bmi = getBMI(weight, height);
		System.out.println(interpreteBMI(bmi));
	}

	public static double getValue(String type) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a " + type + ": ");
		return scanner.nextDouble();
	}

	public static double getBMI(double weight, double height) {
		return 703 * (weight / Math.pow(height, 2));
	}

	public static String interpreteBMI(double index) {
		if (index < 18.5) {
			return "Underweight";
		} else if (index >= 18.5 && index <= 24.9) {
			return "Healthy weight";
		} else if (index >= 25.0 && index <= 29.9) {
			return "Over weight";
		} else {
			return "Obesity";
		}
	}

}
