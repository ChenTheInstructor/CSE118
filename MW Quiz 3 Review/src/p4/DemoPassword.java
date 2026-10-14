package p4;

import java.util.Scanner;

public class DemoPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String passwd = input.nextLine();
		
		if(passwd.equalsIgnoreCase("Java2026")) {
			System.out.println("Access Granted.");
		} else {
			System.out.println("Access Denied.");
		}
	}

}
