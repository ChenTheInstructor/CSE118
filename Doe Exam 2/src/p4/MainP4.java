package p4;

import java.util.Scanner;

public class MainP4 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String word = getWord();
		showResult(hasDuplicates(word));
	}
	
	public static void showResult(boolean result) {
		if(result) {
			System.out.println("The word contains duplicate letters");
		} else {
			System.out.println("The word does not contain duplicate letters");
		}
	}

	private static boolean hasDuplicates(String word) {
		for(int i = 0; i < word.length(); i++) {
			for(int j = i+1; j < word.length(); j++) {
				if((word.charAt(i) == word.charAt(j))) {
					return true;
				}
			}
		}
		return false;
	}
//	private static boolean hasDuplicates(String word) {
//		for(int i = 0; i < word.length(); i++) {
//			for(int j = 0; j < word.length(); j++) {
//				if((word.charAt(i) == word.charAt(j)) && (i != j)) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

	public static String getWord() {
		System.out.println("Enter a word: ");
		return scanner.nextLine();
	}

}
