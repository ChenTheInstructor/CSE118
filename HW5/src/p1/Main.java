package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);// Create a Scanner object named keyboard
//		String name = new String("Joe");// create a String object named name. Reference variable
//		int x  = 5; // primitive
		System.out.println("Did you do well in the last exam? ");
		char firstLetter = keyboard.nextLine().toUpperCase().charAt(0);
//		String answer = keyboard.nextLine();
////		answer = answer.toLowerCase();
//		char firstLetter = answer.charAt(0);
		if(firstLetter == 'Y') {
			System.out.println("Yay!");
		} else {
			System.out.println("Good try!");
		}
		
		
	}

}
