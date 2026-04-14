package workbook;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
//		int number = 10;
//		while(number >= 1) {
//			System.out.println(number--);
////			number--;
//		}
		
//		int n = 5;
//		while(n > 0) {
//			System.out.println(n);
//		}
//		Scanner input = new Scanner(System.in);
//		int number = 0;
//		
//		while(number <= 0) {
//			System.out.println("Enter a positive number: ");
//			number = input.nextInt();
//		} 
//		System.out.println("This is the end of the program.");
		
//		do {
//			System.out.println("Hello");
//		} while(true);
		
//		Scanner input = new Scanner(System.in);
//		String password;
//		do {
//			System.out.println("Enter the password: ");
//			password = input.nextLine();
//		} while(!password.equals("java123"));
//		System.out.println("Your password is correct!");
		
//		int sum = 0;
//		for(int n = 1; n <= 100; n++) {
//			sum = sum + n;
//			System.out.println("The running sum is: " + sum);
//		}
//		System.out.println("The sum is: " + sum);
		
//		for(int j = 10; j >= 1; j--) {
//			System.out.println(j);
//		}
		
		for(int row = 1; row <= 9; row++) { // outer loop
//			System.out.println("row " + i);
			for(int col = 1; col <= 9; col++) { // inner loop
				System.out.print(row + " x " + col + " = " + (row * col) + "\t");
			}
			System.out.println();
		}
	}

}
