package p5;

public class Main {

	public static void main(String[] args) {
		// hard code the data
		double income = 60000;
		int creditScore = 701;
		if(eligibleForLoan(income, creditScore)) {
			System.out.println("eligible for a load.");
		} else {
			System.out.println("Not eligible for a loan.");
		}
		
	}

	private static boolean eligibleForLoan(double income, int creditScore) {
		return (income > 50000 && creditScore > 700);
	}
}
