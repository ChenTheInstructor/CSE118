package p4_break_continue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			
			System.out.println("Enter a username: ");
			String userName = scanner.nextLine();
			System.out.println("Enter a password: ");
			String password = scanner.nextLine();
			System.out.println("You entered: " + userName + ": " + password);
			System.out.println("At this point, i = " + i);
			
			if(i == 2) {
				continue;
			}
			
			System.out.println("Do you want to continue?(Y or N) " );
			String answer = scanner.nextLine();
			if(answer.charAt(0) == 'N' || answer.charAt(0) == 'n') {
				break;
			}
			
		}

		System.out.println("End");

	}

}
