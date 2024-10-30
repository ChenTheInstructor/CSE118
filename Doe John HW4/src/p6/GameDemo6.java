package p6;

import java.util.Random;
import java.util.Scanner;

public class GameDemo6 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num2Guess = rand.nextInt(100) + 1;
		System.out.println("The random number is : " + num2Guess);
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		
		while(true) {
			System.out.println("Enter your guess: ");
			int guess = scanner.nextInt();
//			attempts = attempts + 1;
//			attempts += 1;
			attempts++;
			if(guess == num2Guess) {
				System.out.println("You guessed corretly after " + attempts + " attempts.");
				break;
			} else if (guess > num2Guess) {
				System.out.println("Your guess is too high.");
			} else {
				System.out.println("Your guess is too low.");
			}
		}
	}

}
