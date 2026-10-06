package p1;

import java.util.Scanner;

public class Demo_Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your final score: ");
		double score = input.nextDouble();
		
		if(score < 60) {
			System.out.println("You failed.");
		} else {
			System.out.println("You passed.");
			if(score < 70) {
				System.out.println("You cannot take the next CSE course.");
			} else {
				System.out.println("You are ready to take CSE148.");
			}
		}
		
		System.out.println("I wish you enjoyed the semester.");
	}

}
