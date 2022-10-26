package p2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		while (true) {
			//input
			int computerNumber = (int) (Math.random() * 3);
			//		System.out.println(computerNumber);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Scissor (0), Rock(1), Paper(2)? ");
			int userNumber = scanner.nextInt();
			// process
			if (userNumber > 2 || userNumber < 0) {
				System.out.println("Invalid number.");
			} else {
				if (computerNumber == 0) {
					System.out.print("The computer is scissor. ");
				} else if (computerNumber == 1) {
					System.out.print("The computer is rock. ");
				} else {
					System.out.print("The computer is paper.");
				}

				if ((userNumber == 0 && computerNumber == 2) || (userNumber == 1 && computerNumber == 0)
						|| (userNumber == 2 && computerNumber == 1)) {
					System.out.println("You won.");
				} else if (userNumber == computerNumber) {
					System.out.println("It's a draw.");
				} else {
					System.out.println("You lost.");
				}
			} 
			System.out.println("-------------------------\n");
		}
		
		// output
	}
}
