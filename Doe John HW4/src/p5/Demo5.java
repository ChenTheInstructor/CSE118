package p5;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char ch = scanner.nextLine().toLowerCase().charAt(0);
		if (Character.isLetter(ch)) {

			switch (ch) {
			case 'a', 'e', 'i', 'o', 'u':
				System.out.println("It's a vowel!");
				break;
			default:
				System.out.println("It's a consonant!");
			}

		} else {
			System.out.println("You didn't enter a letter.");
		}
	}

}
