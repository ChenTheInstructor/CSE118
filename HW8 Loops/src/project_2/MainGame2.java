package project_2;

import java.util.Scanner;

public class MainGame2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int healthPoints = 100;
		boolean reachedEnd = false;
		
		while(healthPoints > 0 && !reachedEnd) {
			System.out.println("\nYou're walking through a forest and you come to a fork.");
			System.out.println("Do you want to go left or right? (l/r)");
			String choice = scanner.nextLine();
			int randNum = (int)(Math.random() * 2);
			if(randNum == 0) {
				if(choice.equalsIgnoreCase("l")) {
						System.out.println("You encountered a friendly animal and gain health.");
						healthPoints += 10;
				} else {
					System.out.println("You step on a thorn and lose health.");
					healthPoints -= 10;
				}
			} else {
				if(choice.equalsIgnoreCase("l")) {
					System.out.println("You find a hidden treasure and gain health.");
					healthPoints += 20;
			} else {
				System.out.println("You're caught in a trap and lose health.");
				healthPoints -= 30;
			}
			}
			
			System.out.println("Your current health Points are: " + healthPoints);
			System.out.println("Do you wish to continue to play? (yes/no)");
			String answer = scanner.nextLine();
			if(answer.equalsIgnoreCase("no")) {
				reachedEnd = true;
				System.out.println("You ended the game.");
			}
			
			if(healthPoints <= 0) {
				System.out.println("You lost all your health points. Game over.");
			} else if(reachedEnd && healthPoints > 0) {
				System.out.println("Congrats! You have reached the end of your adventure.");
			}
			
		}
	}

}
