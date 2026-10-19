package p15;

import java.util.Scanner;

public class DemoLetterType {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a lower letter: ");
		char letter = scanner.nextLine().toLowerCase().charAt(0);

		switch (letter) {
		case 'a', 'e', 'i', 'o', 'u', 'y':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//		case 'y':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}

}
