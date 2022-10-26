package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		
		char character = scanner.nextLine().charAt(0);
		int characterNumber = (int)character;
		
		if(characterNumber >= 97 && characterNumber <=122) {
			System.out.println("It is a lowercase letter.");
		} else if(characterNumber >= 65 && characterNumber <=90) {
			System.out.println("It is a uppercase letter.");
		} else if(characterNumber >= 48 && characterNumber <=57) {
			System.out.println("It is a digit.");
		} else if ((characterNumber >= 33 && characterNumber <=47) || (characterNumber >= 58 && characterNumber <=63)) {
			System.out.println("It is a punctuation.");
		} else {
			System.out.println("Something else.");
		}
	}

}
