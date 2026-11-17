package p1;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scores = new int[5];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("Enter score " + (i + 1) +": ");
			scores[i] = input.nextInt();
		}
		
		int total = 0;
		for(int s : scores) {
			total += s; // total = total + s;
		}
		System.out.println("The total: " + total);
		System.out.println("The average: " + (double) total / scores.length);
		
		
//		System.out.println(Arrays.toString(scores));
		for(int num : scores ) {
			System.out.print(num + " ");
		}
	}

}
