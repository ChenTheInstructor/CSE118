package p2_random;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random(20);
		
//		System.out.println(Double.MIN_VALUE + " -- " + Double.MAX_VALUE );
		
		while(true) {
			int die1 = rand.nextInt(1, 7);
			int die2 = rand.nextInt(1, 7);
			int total = die1 + die2;
			if(total == 6) {
				System.out.println("You win!");
			} else {
				System.out.println("You lose!");
			}
			Thread.sleep(2000);
		}
	}

}
