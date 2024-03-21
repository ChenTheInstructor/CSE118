package p8_vowel_or_consonant_checker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		char letter = "m".toLowerCase().charAt(0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		boolean isVowel = switch (scanner.nextLine().toLowerCase().charAt(0)) {
		case 'a', 'e', 'i', 'o', 'u' -> true;
		default -> false;
		};
		System.out.println("It is a vowel? " + isVowel + ".");
	}

}
