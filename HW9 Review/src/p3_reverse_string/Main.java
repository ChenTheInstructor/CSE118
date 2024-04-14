package p3_reverse_string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();

		int firstCharIndex = 0;
		int lastCharIndex = str.length() - 1;
		
		String reversedStr = "";
		
//		for(int i = firstCharIndex; i <= lastCharIndex; i++) {
//			System.out.println("At index " + i + ": " + str.charAt(i));
//			reversedStr = str.charAt(i) + reversedStr;
//			System.out.println("At index " + i + " the reveredStr is : " + reversedStr);
//		}
		
//		for(int i = lastCharIndex; i >= firstCharIndex; i--) {
//			reversedStr += str.charAt(i); // reversedStr = reversedStr + str.charAt(i);
//		}
		
//		while(firstCharIndex <= lastCharIndex) {
//			reversedStr = str.charAt(firstCharIndex) + reversedStr;
//			firstCharIndex++;
//		}
		
//		while(lastCharIndex >= firstCharIndex) {
//			reversedStr += str.charAt(lastCharIndex);
//			lastCharIndex--;
//		}
		
//		do {
//			reversedStr = str.charAt(firstCharIndex) + reversedStr;
//			firstCharIndex++;
//		} while(firstCharIndex <= lastCharIndex);
		
		do {
			reversedStr += str.charAt(lastCharIndex);
			lastCharIndex--;
		} while(lastCharIndex >= firstCharIndex);
		
		System.out.println(reversedStr);
		

	}

}
