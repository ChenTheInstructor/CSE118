package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j < 3; j++) {
			System.out.println("Enter a password: ");
			String word = scanner.nextLine();
			boolean hasDigit = false;
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean passwordIsValid = false;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) >= 48 && word.charAt(i) <= 57) {
					hasDigit = true;
					break;
				}
			}
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
					hasUpperCase = true;
					break;
				}
			}
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
					hasLowerCase = true;
					break;
				}
			}
			if (hasDigit && hasUpperCase && hasLowerCase) {
				passwordIsValid = true;
			}
			if (passwordIsValid) {
				System.out.println("Valid Password!");
			} else {
				System.out.println("Invalid Password");
			} 
		}
	}

}
