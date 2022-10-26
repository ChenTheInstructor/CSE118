package p1_random_numbers;

public class RandomApp {

	public static void main(String[] args) {
		int twoDigitRandomNumber = 10 + (int)(Math.random() * 90 );
		System.out.println(twoDigitRandomNumber);
		
		System.out.println("One's digit: " + twoDigitRandomNumber % 10);
		System.out.println("Ten's digit: " + twoDigitRandomNumber / 10);
		
		
	}

}
