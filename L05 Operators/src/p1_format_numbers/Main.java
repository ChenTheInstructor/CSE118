package p1_format_numbers;

public class Main {

	public static void main(String[] args) {
		double amount = 97.99;
		final double TAX_RATE = 0.08625; // constant variable
		double tax = amount * TAX_RATE;
		double total = amount + tax;
		String header = String.format("%10s%10s%10s%10s",  "Amount", "Tax Rate", "Taxes", "Total");
		String details = String.format("%10.2f%10.5f%10.2f%10.2f",  amount, TAX_RATE, tax, total);
		
		System.out.println(header);
		System.out.println(details);
		
	}

}
