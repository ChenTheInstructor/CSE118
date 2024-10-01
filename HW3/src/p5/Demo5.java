package p5;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// prompt the user for information
		System.out.println("Enter a five-word sentence: ");
		String w1 = scanner.next();
		String w2 = scanner.next();
		String w3 = scanner.next();
		String w4 = scanner.next();
		String w5 = scanner.next();
		int len = w5.length();
		String w5Real = w5.substring(0, len - 1);
		System.out.println("The fifth word without period is: " + w5Real);
		String sentence = w1 + " " + w2 + " " + w3 + " " + w4 + " " + w5Real + ".";
		System.out.println("The sentence entered is: " + sentence);
		System.out.println(sentence.toUpperCase());
		
		String reversedStr = w5Real + " " + w4 + " " + w3 + " " + w2 + " " + w1 + ".";
		System.out.println("The reversed sentence is: " + reversedStr);
	}

}
