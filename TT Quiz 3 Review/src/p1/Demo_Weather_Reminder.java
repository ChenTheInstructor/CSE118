package p1;

import java.util.Scanner;

public class Demo_Weather_Reminder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the current temperature: "); // prompt
		int temp = input.nextInt();
		
		if(temp < 50) {  // temp < 50 is a condition, always true or false
			System.out.println("Wear a warm coat.");
		}
		
		System.out.println("Have a good day!");
	}

}
