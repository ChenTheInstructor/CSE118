package p2_do_while_loop;

import java.util.Scanner;

public class LoginApp {
	
	public static void showUsernamePassword() {
		
	}

	public static void main(String[] args) {
		String username = "JohnDoe";
		String password = "Secret";
		Scanner scanner = new Scanner(System.in);
		String usernameEntered;
		String passwordEntered;
		
		do {
			System.out.println("Enter username and password: ");
			usernameEntered = scanner.next();
			passwordEntered = scanner.next();
			if(usernameEntered.equals(username) && passwordEntered.equals(password)) {
				System.out.println("You entered correct username and password!");
				break;
			}
		} while(true);
//		do {
//			System.out.println("Enter username and password: ");
//			usernameEntered = scanner.next();
//			passwordEntered = scanner.next();
//			if(usernameEntered.equals(username) && passwordEntered.equals(password)) {
//				System.out.println("You entered correct username and password!");
//			}
//		} while(!(usernameEntered.equals(username) && passwordEntered.equals(password)));
		
		// The scope of a variable: A variable is only visible in the block of code where it is declared
	}

}
