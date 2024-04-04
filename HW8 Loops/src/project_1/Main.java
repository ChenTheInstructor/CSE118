package project_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberToGuess = (int) (Math.random() * 100 + 1);
		int numberOfAttempts = 0;
		int guess = 0;
		do {
			System.out.println("Enter your guess: ");
			guess = scanner.nextInt();
			numberOfAttempts++;
			
			if(guess < numberToGuess) {
				System.out.println("The guess is too low. Try again.");
			} else if(guess > numberToGuess) {
				System.out.println("The guess is too high. Try again.");
			} else {
				System.out.println("Congrats! You guessed it right.");
				break;
			}
			
		}while(true);
		
		System.out.println("You guessed " + numberOfAttempts + " times");

	}

}
