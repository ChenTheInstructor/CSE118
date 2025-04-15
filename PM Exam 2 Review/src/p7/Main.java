package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String major = getMajor().toUpperCase();
		showDepartment(major);
	}

	private static void showDepartment(String major) {
		switch (major) {
		case "CS":
			System.out.println("Computer Science");
			break;
		case "BIO":
			System.out.println("BIOLOGY");
			break;
		case "ENG":
			System.out.println("Engineering");
			break;
		default:
			System.out.println("No such major!");
		}
	}

	private static String getMajor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a major (CS, BIO, ENG): ");
		return scanner.nextLine();
	}

}
