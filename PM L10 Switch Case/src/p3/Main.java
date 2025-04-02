package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ask the user to provide a single letter such as 'a', 'b', 'c', 'd' or 'f'
		// then use switch case to determine the range of the score of the test as a 
		// string such as "100 >= score >= 90"
		char letter = getLetterGrade();
		letter = Character.toLowerCase(letter);
		String scoreRange = getScoreRange(letter);
		System.out.println(scoreRange);
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
