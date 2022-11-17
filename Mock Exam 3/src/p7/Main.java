package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int wholeNumber = getInteger();
//		double realNumber = getDouble();
//		double sum = add(wholeNumber, realNumber);
//		show(sum);
//		show(add(getInteger(), getDouble()));
		
	}
	
	public static int getLength(String str) {
		return str.length();
	}
	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		return scanner.nextLine();
	}
	
	public static void show(double m) {
		System.out.println(m);
	}
	
	public static int getInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		return scanner.nextInt();
	}
	
	public static double getDouble() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a double: ");
		return scanner.nextDouble();
	}
	
	public static double add(double n1, double n2) {
		return n1 + n2;
	}
	
	public static double add(int n1, double n2) {
		return n1 + n2;
	}

}
