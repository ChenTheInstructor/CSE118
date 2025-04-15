package p8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String major = getMajor();
		String departmentName = getDepartmentName(major);
		showDepartmentName(departmentName);
	}

	private static void showDepartmentName(String departmentName) {
		System.out.println(departmentName);
	}

	private static String getDepartmentName(String major) {
		String depart;
		switch (major.toUpperCase()) {
		case "CS":
			depart = "Comp Sci";
			break;
		case "BIO":
			depart ="Biology";
			break;
		case "ENG":
			depart = "Engineering";
			break;
		default:
			depart = "No such major in school.";
		}
		
		return depart;
	}

	private static String getMajor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your major: ");
		return scanner.nextLine();
	}

}
