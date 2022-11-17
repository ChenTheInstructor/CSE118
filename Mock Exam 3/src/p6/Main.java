package p6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String sentence = getSentence();
		show(getNumberOfCapitalLetters(sentence));
		show(getNumberOfLowercaseLetters(sentence));
		show(getWords(sentence));
	}
	
	public static String getSentence() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		return scanner.nextLine();
	}
	
	public static int getNumberOfCapitalLetters(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		return count;
	}
	
	public static int getNumberOfLowercaseLetters(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				count++;
			}
		}
		return count;
	}
	
	public static int getWords(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count + 1;
	}
	
	public static int getLength(String str) {
		return str.length();
	}
	
	public static void show(String str) {
		System.out.println(str);
	}
	
	public static void show(int n) {
		System.out.println(n);
	}

}
