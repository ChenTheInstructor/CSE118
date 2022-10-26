package p2_lottery;

import java.util.Scanner;

public class LotteryApp {

	public static void main(String[] args) {
		// input
		int lotteryNumber = 10 + (int)(Math.random() * 90); // create a 2-digit lottery number
		System.out.println("Lottery Number: " + lotteryNumber);
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a player number (2 digits only): ");
		int playerNumber = scanner.nextInt();
		
		
		// process
		int lotteryOnesDigit = lotteryNumber % 10;
		int playerOnesDigit = playerNumber % 10;
		int lotteryTensDigit = lotteryNumber / 10;
		int playerTensDigit = playerNumber / 10;
		
		if(playerNumber == lotteryNumber) {
			System.out.println("You won $10,000.");
		} else if(lotteryOnesDigit == playerTensDigit ) {
			System.out.println("You won $10.");
		} else if (lotteryTensDigit == playerOnesDigit) {
			System.out.println("You won $10.");
		} else if (lotteryTensDigit == playerTensDigit) {
			System.out.println("You won $2,000.");
		} else if( lotteryOnesDigit == playerOnesDigit) {
			System.out.println("You won $2,000.");
		} else if (lotteryOnesDigit == playerTensDigit && lotteryTensDigit == playerOnesDigit) {
			System.out.println("You won $100.");
		} else {
			System.out.println("You won $0.");
		}
		
		
		// output
	}

}
