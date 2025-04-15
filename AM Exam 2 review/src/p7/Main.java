package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String major = getMajor();
		printDepartment(major);
	}

	private static void printDepartment(String major) {
		switch (major.toUpperCase()) {
		case "CS":
			System.out.println("Comp Sci");
			break;
		case "BIO":
			System.out.println("Biology");
			break;
		case "ENG":
			System.out.println("Engineering");
			break;
		default:
			System.out.println("No such major in school.");
		}
	}

	private static String getMajor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your major: ");
		return scanner.nextLine();
	}

}
