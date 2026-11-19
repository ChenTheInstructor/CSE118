package quiz5_Preview;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[8];
		
		System.out.print("Enter 8 integers: ");
		for(int i  = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		int target = 50;
		int count = 0;
		for(int n : numbers) {
			if(n == target) {
				count++;
			}
		}
		
		System.out.println("The occurrence of " + target +" is: " + count);
		
	}

}
