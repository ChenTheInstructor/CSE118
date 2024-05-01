package p3;

public class Main {

	public static void main(String[] args) {
		double[] numbers = {2.2, 1.1, 3.3};
		double average = calculateAverage(numbers);
		System.out.printf("The average is: %.2f", average);
	}

	private static double calculateAverage(double[] numbers) {
		double total = 0.0;
		
		for(double num : numbers) {
			total += num;
		}
		return total / numbers.length;
	}

}
