package p2_while;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password = "Java2026";
		
		do {
			System.out.print("Enter your password: ");
			String pass = input.nextLine();
			if(pass.equals(password)) {
				break;
			}
		} while(true);
		
	}

}
