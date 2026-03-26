package p1;

import java.util.Scanner;

public class Challenge3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username and password: ");
		String username = scanner.next();
		String password = scanner.next();
		if(username.equalsIgnoreCase("Admin") && password.equals("Secret#")) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure.");
		}
	}

}
