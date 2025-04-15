package p2_random;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble(10));
		System.out.println(rand.nextDouble(5, 10));
		System.out.println();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(10));
		System.out.println(rand.nextInt(5, 10));
		System.out.println();
		System.out.println(rand.nextBoolean());
	}

}
