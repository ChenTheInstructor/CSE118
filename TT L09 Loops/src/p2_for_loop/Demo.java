package p2_for_loop;

public class Demo {

	public static void main(String[] args) {
		// calculate the sum of numbers from 1 to 10
		int accumulator = 0;
		int product = 1;
		int count = 0;
		
		for (int i = 2; i <= 10; i = i + 2) {
			count++;
			accumulator = accumulator + i;
			product = product * i;
		}
		System.out.println("The sum is: " + accumulator);
		System.out.println("The average is " + (double)accumulator / count);
		System.out.println("The product of the even numbers is: " + product);
	}

}
