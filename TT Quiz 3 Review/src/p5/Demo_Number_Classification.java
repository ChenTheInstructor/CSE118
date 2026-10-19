package p5;

import java.util.Scanner;

public class Demo_Number_Classification {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to classify: "); // prompt
		int num = input.nextInt();
		
		if(num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		
		
	}

}
