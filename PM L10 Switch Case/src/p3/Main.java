package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ask the user to provide a single letter such as 'a', 'b', 'c', 'd' or 'f'
		// then use switch case to determine the range of the score of the test as a 
		// string such as "100 >= score >= 90"
//		char letter = getLetterGrade();
//		letter = Character.toLowerCase(letter);
//		String scoreRange = getScoreRange(letter);
//		System.out.println(scoreRange);
//		System.out.println(isLeapYear(1900));
//		System.out.println(isVowel('A'));
//		System.out.println(Character.isUpperCase('A'));
//		String name1 = "Aohn D. Doe";
//		String name2 = "Aphn D. Doe";
//		System.out.println(name1.compareTo(name2));
//		System.out.println(name.indexOf(" "));
//		System.out.println(name.lastIndexOf(" "));
//		System.out.println(name.substring(2, 6));
//		describeNumber(-10);
		System.out.println(isPalindrome(987));
	}
	
	public static boolean isPalindrome(int n) {
		return (n / 100) == (n % 10);
	}
	
	public static void describeNumber(int n) {
		System.out.println((n < 0) ? "Negative" : (n == 0) ? "Zero" : (n % 2 == 0) ? "Positive Even" : "Positive Odd");
//		if(n < 0) {
//			System.out.println("Negative");
//		} else if (n == 0) {
//			System.out.println("Zero");
//		} else {
//			if(n % 2 == 0) {
//				System.out.println("Positive even");
//			} else {
//				System.out.println("Positive odd");
//			}
//		}
	}
	
	
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
	}
	
	public static boolean isLeapYear(int year) {
//		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		if(year % 4 != 0) {
			return false;
		} else {
			if(year % 100 != 0) {
				return true;
			} else if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	

	private static String getScoreRange(char letter) {
		return switch(letter) {
		case 'a' -> "Between 90 and 100";
		case 'b' -> "Between 80 and 90";
		case 'c' -> "Between 70 and 80";
		case 'd' -> "Between 60 and 70";
		case 'f' -> "Below 60";
		default -> "No such letter grade!";
		};
	}



	private static char getLetterGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		return scanner.nextLine().charAt(0);
	}

}
