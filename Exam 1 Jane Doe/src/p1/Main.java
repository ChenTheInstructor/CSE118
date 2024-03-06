package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// asks the user for a name and displays the first letter in lowercase
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();
//		System.out.println(name.substring(0, 1).toLowerCase());
		System.out.println(name.toLowerCase().charAt(0));
	}

}
