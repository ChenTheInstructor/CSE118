package p5_overloaded_methods;

import java.util.Scanner;

public class MainOverloadedApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		System.out.println("Enter a whole number: ");
		int wholeNumber = scanner.nextInt();
		System.out.println("Enter a real number: ");
		double realNumber = scanner.nextDouble();
		
//		show(word);
//		show(wholeNumber);
//		show(realNumber);
		
//		show(wholeNumber, realNumber, word);
//		show(word, wholeNumber);
//		
//		double sum = getSum(wholeNumber, realNumber);
//		show(sum);
		
		show(word, realNumber, wholeNumber);
	}
	
	
	// overloaded methods
	
	public static void show(String s, double d, int i) {
		System.out.println(s + ", " + d + ", " + i);
	}
	
	public static double getSum(int x, double y) {
		return x + y;
	}
	public static void show(int x, double y, String z) {
		System.out.println(z + ", " + x + ", " + y);
	}
	
	public static void show(String x, int y) {
		System.out.println(x + ": " + y);
	}
	
	public static void show(double n) {
		System.out.println(n);
	}
	
	public static void show(String str) {
		System.out.println(str);
	}

	public static void show(int n) {
		System.out.println(n);
	}
}
