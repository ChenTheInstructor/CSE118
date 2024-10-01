package p5;

import java.util.Scanner;

public class Demo5_v2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// prompt the user
		System.out.println("Enter a five-word sentence: ");
		String sentence = scanner.nextLine();
		System.out.println(sentence);
		System.out.println(sentence.toUpperCase());

		// split the sentence into five words
		// get w1
		String w1 = sentence.substring(0, sentence.indexOf(" "));
//		System.out.println(w1);

		// get w2
		String remainingStr = sentence.substring(sentence.indexOf(" ") + 1);
//		System.out.println(remainingStr);
		String w2 = remainingStr.substring(0, remainingStr.indexOf(" "));
//		System.out.println(w2);

		// get w3
		remainingStr = remainingStr.substring(remainingStr.indexOf(" ") + 1);
		String w3 = remainingStr.substring(0, remainingStr.indexOf(" "));

		// get w4
		remainingStr = remainingStr.substring(remainingStr.indexOf(" ") + 1);
		String w4 = remainingStr.substring(0, remainingStr.indexOf(" "));

		// get w5
		remainingStr = remainingStr.substring(remainingStr.indexOf(" ") + 1);
		String w5 = remainingStr.substring(0, remainingStr.length() - 1);
		
		String reversedStr = w5 + " " + w4 + " " + w3 + " " + w2 + " " + w1 + ".";
		System.out.println(reversedStr);

	}

}
