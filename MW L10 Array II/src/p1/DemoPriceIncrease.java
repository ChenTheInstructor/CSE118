package p1;

import java.util.Arrays;

public class DemoPriceIncrease {

	public static void main(String[] args) {
		double[] prices = {10.00, 25.00, 8.50};
		
		for(int i = 0; i < prices.length; i++) {
			prices[i] = prices[i] * 1.05;
		}
//		System.out.println(Arrays.toString(prices));
		for(double price : prices) {
			System.out.printf("%.2f\t", price);
		}
		System.out.println();
	}

}
