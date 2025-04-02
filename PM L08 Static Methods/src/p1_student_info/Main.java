package p1_student_info;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String name = getName();
		int age = getAge();
		double gpa = getGpa();
		double curveAmount = getCurveAmount();
		double curvedGpa = computeCurvedGpa(gpa, curveAmount);
		boolean isGreat = greatOrGood(curvedGpa);
		displayInformation(name, age, gpa, curvedGpa, curveAmount, isGreat);
		
		
	}
	
	public static boolean greatOrGood(double curvedGpa) {
//		if(curvedGpa >= 1.0) { // expression
//			return "Great";
//		} 
//		return "Good";
		
		return curvedGpa >= 1.0;
		
	}
	
	public static void displayInformation(String name, int age, double gpa, 
			double curvedGpa, double curveAmount, boolean isGreat) {
		System.out.printf("%-10s%10s%15s%15s%15s%15S\n", "Name", "Age", "GPA", "CurvedGPA", "CurveAmount", "GreatOrGood");
		System.out.printf("%-10s%10d%15.1f%15.1f%15.1f%15b\n", name, age, gpa, curvedGpa, curveAmount, isGreat);
	}
	
	public static double computeCurvedGpa(double gpa, double curveAmount) {
		return  gpa + curveAmount;
	}
	
	public static double getCurveAmount() {
		System.out.println("Enter the curve amount: ");
		return scanner.nextDouble();
	}
	
	public static double getGpa() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your GPA: ");
		return scanner.nextDouble();
	}
	
	public static int getAge() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		return scanner.nextInt();
	}
	
	public static String getName() {
//		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		return scanner.nextLine();
	}

}
