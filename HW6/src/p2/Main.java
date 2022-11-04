package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		char firstLetter = word.charAt(0);
		char lastLetter = word.charAt(word.length()-1);
		String lastLetterStr =  word.substring(word.length()-1);
		System.out.println("First letter: " + firstLetter);
		System.out.println("Last letter: " + lastLetter);
		System.out.println("Last letter: " + lastLetterStr);
		System.out.println(firstLetter + " " + lastLetter + " " + lastLetterStr);
	}

}
