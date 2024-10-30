package p1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		String str = getString();
		int numVowels =  countVowels(str); // numVowels is local
		showResult(numVowels);
		showResult2(numVowels);
	}
	
	private static void showResult2(int result) {
		System.out.printf("The vowel number is: %d.%n", result );
	}

	private static void showResult(int count) { // count is local 
		System.out.println("The number of vowels is: " + count);		
	}

	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		return scanner.nextLine();
	}

	public static int countVowels(String str) {
		int numVowels = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
				numVowels++;
			}
				
		}
		return numVowels;
	}

}
