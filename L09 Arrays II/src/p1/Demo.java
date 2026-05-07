package p1;

import java.util.Arrays;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] dishes = new String[10];
		double[] prices = new double[10];
		
		for(int i = 0; i < prices.length; i++) {
			prices[i] = rand.nextInt(5, 30) + 0.99;
		}
		
		dishes[0] = "Beef";
		dishes[1] = "Fish";
		dishes[2] = "Veggie";
		dishes[3] = "Egg Pie";
		dishes[4] = "Beef Stew";
		dishes[5] = "Fish Soup";
		dishes[6] = "Veggie Salad";
		dishes[7] = "Eggs";
		dishes[8] = "Soup";
		dishes[9] = "Pizza";
		
		for(int i = 0; i< dishes.length; i++) {
			System.out.printf("%-20S%10.2f%n", dishes[i], prices[i]);
		}
		
		double max = getMax(prices);
		double min = getMin(prices);
		double average = getAverage(prices);
		System.out.println("The highest price: " + max);
		System.out.println("The lowest price: " + min);
		System.out.println("The average price: " + average);
			
	}
	
	public static double getAverage(double[] prices) {
		double sum = 0;
		for(int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		return sum/prices.length;
	}
	public static double getMin(double[] prices) {
		double min = 10000.0;
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < min) {
				min = prices[i];
			}
		}
		return min;
	}
	
	public static double getMax(double[] prices) {
		double max = 0.0;
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] > max) {
				max = prices[i];
			}
		}
		return max;
	}

}
