package p4;

import java.util.Scanner;

public class Demo_Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = input.nextLine();
		
		if(password.equals("Java2026")) {
			System.out.println("Access Granted.");
		} else {
			System.out.println("Access Denied.");
		}
	}

}
