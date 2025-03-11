package p1_random_number_generator;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("The randomNumber is: " + (random.nextInt(20) + 1));
		
	}

}
