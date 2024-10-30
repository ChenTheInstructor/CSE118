package p2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		if(word.length() <= 3 && word.length() > 0) {
			System.out.println("Short.");
		} else if (word.length() <= 6 && word.length() >= 4) {
			System.out.println("Medium.");
		} else if (word.length() >= 7) {
			System.out.println("Long.");
		} else {
			System.out.println("Empty.");
		}
	}

}
