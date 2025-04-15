package p5;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);//static field

	public static void main(String[] args) {
		double income = getIncome();
		int creditScore = getCreditScore();
		
		//process
		loanOrNoLoan(income, creditScore);
	}

	private static void loanOrNoLoan(double income, int creditScore) {
		if(income > 50000 && creditScore > 700) {
			System.out.println("Loan!");
		} else {
			System.out.println("No load for you!");
		}
		
	}

	private static int getCreditScore() {
		System.out.print("Enter your credit score: ");
		return scanner.nextInt();
	}

	private static double getIncome() {
		System.out.print("Enter your income: ");
		return scanner.nextDouble();
	}

}
