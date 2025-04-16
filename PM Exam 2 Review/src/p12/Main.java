package p12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char ch = getCharacter();
		decideCharacterType(ch);
		System.out.println(isUpperCaseLetter(ch));
	}

	private static void decideCharacterType(char ch) {
			if(Character.isDigit(ch)) {
				System.out.println("It's a digit.");
			} else if(Character.isAlphabetic(ch)) {
				System.out.println("It's a letter.");
			} else if(Character.isWhitespace(ch)) {
				System.out.println("It's a white space.");
			} else {
				System.out.println("It's something else.");
			}
	}

	private static char getCharacter() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		return scanner.nextLine().charAt(0);
	}

	public static boolean isUpperCaseLetter(char ch) {
		return Character.isUpperCase(ch);
	}
}
