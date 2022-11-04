package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a name: ");
		String name = getString();
		
		if(!isValidName(name)) {
			System.out.println("Invalid name!");
			return;
		}

		System.out.println("Enter a major: ");
		String major = getString();
		
		System.out.println("Enter a GPA: ");
		double gpa = getGpa();
		
//		scanner.nextLine(); //consume the enter key
		
		System.out.println("Enter an address: ");
		String address = getString();
		
		display(name, major, gpa, address);

	}

	public static boolean isValidName(String name) {
		if(hasDigit(name) || isBlank(name) || !hasAtLeast4Characters(name)) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean hasDigit(String n) {
		boolean isDigit = false;
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
				isDigit = true;
				break;
			}
		}
		return isDigit;
	}

	public static boolean hasAtLeast4Characters(String name) {
		if (name.length() >= 4) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isBlank(String name) {
		return name.isBlank();
	}

	public static void display(String name, String major, double gpa, String address) {
		System.out.println(name + ": " + major + ", " + gpa + ", " + address);
	}

	public static double getGpa() {
		Scanner scanner = new Scanner(System.in);
		double gpa = scanner.nextDouble();
		if (gpa >= 0 && gpa <= 4.0) {
			return gpa;
		} else if (gpa < 0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		return str;
	}

}
