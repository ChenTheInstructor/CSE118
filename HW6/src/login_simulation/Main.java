package login_simulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username = "John";
		String password = "secret";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your username and password: ");
		String user = scanner.next();
		String pass = scanner.next();
		System.out.println(user + " " + pass);

		if (username.equals(user) && (password.equals(pass))) {
			System.out.println("Login success!");
		} else {
			System.out.println("Enter your username and password again: ");
			user = scanner.next();
			pass = scanner.next();
			if (username.equals(user) && (password.equals(pass))) {
				System.out.println("Login success!");
			} else {
				System.out.println("Enter your username and password the third time: ");
				user = scanner.next();
				pass = scanner.next();
				if (username.equals(user) && (password.equals(pass))) {
					System.out.println("Login success!");
				} else {
					System.out.println("login failure! Your account is locked now.");

				}
			}
		}
	}
}
