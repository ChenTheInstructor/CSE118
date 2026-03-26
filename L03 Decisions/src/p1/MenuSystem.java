package p1;

import java.util.Scanner;

public class MenuSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 1000.00;
		System.out.println("\n\t   MENU");
		System.out.println("\t1. Check Balance");
		System.out.println("\t2. Deposit");
		System.out.println("\t3. Withdraw");
		System.out.println("\t4. Exit");
		System.out.print("\n\tEnter your choice: ");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1, 11, 111, 1111: 
			System.out.printf("The balance is: $%.2f%n", balance);
			break;
		case 2, 22: 
			System.out.print("What is the deposit amount: ");
			double deposit = scanner.nextDouble();
			balance += deposit; // balance = balance + deposit;
			System.out.printf("The balance is: $%.2f%n", balance);
			break;
		case 3: 
			System.out.print("What is the withdrawal amount: ");
			double withdraw = scanner.nextDouble();
			if(withdraw > balance) {
				System.out.println("Error! Insufficient funds!");
			} else {
				balance -= withdraw; // balance = balance - withdraw;
			}
			System.out.printf("The balance is: $%.2f%n", balance);
			break;
		case 4: 
			System.out.println("Thank you for using our service. Goodbye!");
			break;
		default: 
			System.out.println("Invalid choice.");
		}
		scanner.close();
	}

}
