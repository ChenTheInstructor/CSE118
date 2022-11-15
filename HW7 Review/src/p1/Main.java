package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		final int MIN_USERNAME_LENGTH = 4;
//		System.out.println("Enter a username: ");
//		String username = getString();
////		boolean isRightLength = hasRightLength(username, MIN_USERNAME_LENGTH);
////		System.out.println("The username has the right length? " + isRightLength);
//
//		System.out.println("Is the username valid? " + isValidUsername(username, MIN_USERNAME_LENGTH));
		System.out.println("Enter a password: ");
		String password1 = getString();
		System.out.println("Enter the password again: ");
		String password2 = getString();
		
		System.out.println(hasCapitalLetter(password1));
	}
	
	public static boolean hasCapitalLetter(String password) {
		for(int i = 0; i < password.length(); i++) {
			if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				return true;
			}
		}
		return false;
	} 
	
	public static boolean isRightLength(String password, int min_length) {
		if(password.length() >= min_length) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean areSame(String password1, String password2) {
		if(password1.equals(password2)) {
			return true;
		} else {
			return false;
		}
	}

	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static boolean hasRightLength(String username, int min_length) {
		if (username.length() >= min_length) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNotBlank(String username) {
		return !username.isBlank();
	}

	public static boolean hasOnlyLettersAndDigits(String username) {
		username = username.toUpperCase();
		for (int i = 0; i < username.length(); i++) {
			char current = username.charAt(i);
			if (!((current >= 'A' && current <= 'Z') || (current >= '0' && current <= '9'))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isValidUsername(String username, int min_length) {
		boolean isRightLength = hasRightLength(username, min_length);
		boolean notBlank = isNotBlank(username);
		boolean onlyLettersAndDigits = hasOnlyLettersAndDigits(username);
		if(isRightLength && notBlank && onlyLettersAndDigits) {
			return true;
		} else {
			return false;
		}
	}

}
