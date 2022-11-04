package p1_intro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.nextLine();
		
		for (int i = 0; i < word.length(); i++) {

			System.out.println(word.charAt(i));
		}
		
		for(int i = word.length()-1; i >= 0; i--) {
			System.out.println(word.charAt(i));
		}
//		System.out.println("End");
	}

}
