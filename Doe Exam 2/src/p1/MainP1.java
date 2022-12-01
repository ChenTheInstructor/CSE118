package p1;

import java.util.Scanner;

public class MainP1 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String word = getWord();
		checkWord(word);
	}

	public static String getWord() {
		System.out.println("Enter a word: ");
		return scanner.nextLine();
	}

	public static void checkWord(String word) {
		checkCapital(word);
		checkLowercase(word);
		checkDigit(word);
		checkLength(word);
		checkBlank(word);
	}

	public static void checkBlank(String word) {
		if (word.isBlank()) {
			System.out.println("The word " + word + " is blank.)");
		} else {
			System.out.println("The word " + word + " is NOT blank");
		}
	}

	public static void checkLength(String word) {
		if (word.length() >= 4) {
			System.out.println("The word " + word + " is four or more character");
		} else {
			System.out.println("The word " + word + " less than four characcters.");
		}
	}

	public static void checkDigit(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
				System.out.println("The word " + word + " contains digit(s)");
				return;
			}
		}
		System.out.println("The word " + word + " does NOT contain digit(s)");

	}

	public static void checkCapital(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				System.out.println("The word " + word + " contains capital letter(s)");
				return;
			}
		}
		System.out.println("The word " + word + " does NOT contain capital letter(s)");
	}

	public static void checkLowercase(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
				System.out.println("The word " + word + " contains lowercase letter(s)");
				return;
			}
		}
		System.out.println("The word " + word + " does NOT contain lowercase letter(s)");
	}
}
