package p1_random_number_generator;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			Random random = new Random();
			System.out.println(random.nextInt(1, 22));
			scanner.nextLine();
		}
	}

}
