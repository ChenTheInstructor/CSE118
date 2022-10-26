package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two words separated by a space: ");
		String word1 = keyboard.next();
		String word2 = keyboard.next();

//		if(word1.equals(word2)) {
//			System.out.println("They are the same word. The length is: " + word1.length());
//		} else {
//			if(word1.compareTo(word2) > 0) {
//				System.out.println(word1 + " is greater. Its length is: " + word1.length());;
//			} else {
//				System.out.println(word2 + " is greater. Its length is: " + word2.length());
//			}
//		}

		if (word1.compareTo(word2) == 0) {
			System.out.println("They are the same word. The length is: " + word1.length());
		} else if (word1.compareTo(word2) > 0) {
			System.out.println(word1 + " is greater. Its length is: " + word1.length());
		} else {
			System.out.println(word2 + " is greater. Its length is: " + word2.length());
		}

	}

}
