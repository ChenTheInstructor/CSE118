package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int min_length = 4;
		
		System.out.println("Enter a username: ");
		String username = getString();
		
		if(isValidUserame(username, min_length)) {
			System.out.println("Invalid username");
			return;
		}
		
		System.out.println("Enter a password: ");
		String password1 = getString();
		
		System.out.println("Enter the password again: ");
		String password2 = getString();
		
		if (!isValidPassword(password1, password2, min_length, username)) {
			System.out.println("Invalid password");
		return;
		}

	}
	
	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.nextLine();
		return str;		
	}
	
	public static boolean hasRightLength(String username, int min_length) {
		if(username.length() >= min_length) {
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
		if (!((current >= 'A' && current <= 'Z')
		|| (current >= '0' && current <= '9'))) {
		return false;
		}
		}
		return true;
	}
	
	public static boolean isValidUserame(String username, int min_length) {
		if(hasRightLength(username, min_length) || isNotBlank(username) || hasOnlyLettersAndDigits(username)) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean samePasswords(String password1, String password2) {
		if(password1.equals(password2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasRightPasswordLength(String password1, int min_length) {
		if(password1.length() >= min_length) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean hasCapitalLetter(String password1) {
		boolean isCapital = false;
		for(int i = 0; i < password1.length(); i++) {
			if(password1.charAt(i) >= 'A' && password1.charAt(i) <= 'Z') {
				isCapital = true;
				break;
			}
		}
		return isCapital;
	}
	
	public static boolean hasDigit(String password1) {
		boolean isDigit = false;
		for(int i = 0; i < password1.length(); i++) {
			if(password1.charAt(i) >= '0' && password1.charAt(i) <= '9') {
				isDigit = true;
				break;
			}
		}
		return isDigit;
	}
	
	public static boolean hasPunctuation(String password1) {
		boolean isPunctuation = false;
		for(int i = 0; i < password1.length(); i++) {
			if(password1.charAt(i) >= '!' && password1.charAt(i) <= '/') {
				isPunctuation = true;
				break;
			}
		}
		return isPunctuation;
	}
	
	public static boolean hasLettersDigitsAndPunctuation(String password1) {
		password1 = password1.toUpperCase();
		for (int i = 0; i < password1.length(); i++) {
		char current = password1.charAt(i);
		if (!((current >= 'A' && current <= 'Z') || (current >= '0' && current <= '9') || (current >= '!' && current <= '/'))) {
		return false;
		}
		}
		return true;
	}
	
	public static boolean hasNoUsername(String password1, String username) {
		if(!(password1.contains(username))) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidPassword(String password1, String username, int min_length, String password2) {
		if(samePasswords(password1, password2) || hasRightPasswordLength(password1,  min_length) || hasCapitalLetter(password1) || hasDigit(password1) || hasPunctuation(password1) || hasLettersDigitsAndPunctuation(password1) || hasNoUsername(password1, username) ) {
			return false;
		} else {
			return true;
		}
	}


}
