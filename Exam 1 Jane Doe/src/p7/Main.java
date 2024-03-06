package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the full name: ");
		String name = scanner.nextLine();
		System.out.println("The first letter is an uppercase letter? ");
		System.out.println(Character.isUpperCase(name.charAt(0)));
	}

}
