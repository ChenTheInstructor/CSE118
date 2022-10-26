package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int MIN_USERNAME_LENGTH  = 4;
		final int MIN_PASSWORD_LENGTH  = 6;
		
		boolean usernameIsValid = true;
		boolean passwordIsValid = true;
		String usernameError = "Username error: \n";
		String passwordError = "Password error: \n";
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a username: ");
		String username = kb.nextLine();
		System.out.println("Enter a password: ");
		String password1 = kb.nextLine();
		System.out.println("Enter the password again: ");
		String password2 = kb.nextLine();
		
		if(username.length() < MIN_USERNAME_LENGTH ) {
			usernameIsValid = false;
			usernameError += "Username length is less than " + MIN_USERNAME_LENGTH + " characters.\n";
		}
		
		if(!password1.equals(password2)) {
			passwordError += "Passwords entered do not match\n";
			passwordIsValid = false;
		} else {
			if(password1.length() < MIN_PASSWORD_LENGTH) {
				passwordError += "Password length is less than " + MIN_PASSWORD_LENGTH + "\n";
				passwordIsValid = false;
			}
			if(password1.contains(username)) {
				passwordError += "Password contains username.\n";
				passwordIsValid = false;
			}
		}
		
		if(usernameIsValid && passwordIsValid) {
			System.out.println("username: " +  username + "\tpassword: " + password1);
		} else {
			System.out.println(usernameError);
			System.out.println();
			System.out.println(passwordError);
		}
	}

}
