package p1;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// getName
		String name = getName();

		// getAge
		int age = getAge();

		// getGpa
		double gpa = getGpa();

		// getCurveAmount
		double curveAmount = getCurveAmount();

		// calculate curvedGpa;
		double curvedGPA = curveGPA(gpa, curveAmount);

		// show results
		printDetails(name, age, gpa, curveAmount, curvedGPA);
		
		System.out.println("Are you on Dean's List: " + onDeansList(curvedGPA));
	}

	public static boolean onDeansList(double gpa) {
		if (gpa >= 3.5) {
			return true;
		} else {
			return false;
		}
	}

	public static void printDetails(String name, int age, double gpa, double curveAmount, double curvedGPA) {
		// display Results in a table
		System.out.printf("%-10s%5s%10s%10s%10s%n", "Name", "Age", "GPA", "C_GPA", "C_Amt");
		System.out.printf("%-10s%5d%10.1f%10.1f%10.1f%n", name, age, gpa, curvedGPA, curveAmount);
	}

	public static double curveGPA(double originalGPA, double curveAmount) {
		double curvedGPA = originalGPA + curveAmount;
		if (curvedGPA > 4.0) {
			curvedGPA = 4.0;
		}

		if (curvedGPA < 0) {
			curvedGPA = 0.0;
		}
		return curvedGPA;
	}

	public static double getCurveAmount() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the curve amount: ");
		return scanner.nextDouble();
	}

	public static double getGpa() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		if (gpa > 4.0) {
			gpa = 4.0;
		}
		if (gpa < 0.0) {
			gpa = 0.0;
		}
		return gpa;
	}

	public static int getAge() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		return scanner.nextInt();
	}

	public static String getName() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		return scanner.nextLine();
	}

}
