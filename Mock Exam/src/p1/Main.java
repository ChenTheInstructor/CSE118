package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double investmentAmount = getInvestmentAmount();
		double annualInterestRate = getAnnualInterestRate();
		int years = getNumberOfYears();
		double futureInvestmentAmount = getFutureAmount(investmentAmount, annualInterestRate, years);
		System.out.println("The future investment value is: "+ futureInvestmentAmount);
	}

	private static int getNumberOfYears() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		return scanner.nextInt();
	}
	
	public static double getAnnualInterestRate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the annual interest rate: ");
		String rate = scanner.nextLine();
		double interestRate = Double.parseDouble(rate.substring(0, rate.indexOf("%")))/100.0;
		return interestRate;
	}

	private static double getFutureAmount(double investmentAmount, double annualInterestRate, int years) {
		double monthlyInterestRate = annualInterestRate / 12.0;
		return truncateNumber(investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12)));
	}

	private static double getInvestmentAmount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the investment amount: ");
		return scanner.nextDouble();
	}
	
	public static double truncateNumber(double number) {
		int indexOfDecimalPoint = String.valueOf(number).indexOf(".");
		String newNumberStr = String.valueOf(number).substring(0, indexOfDecimalPoint+3);
		number = Double.parseDouble(newNumberStr);
		return number;
		
	}

}
