package p6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("Enter a positive number or type 'exit' to quit: ");
			input = scanner.nextLine();
			
			if(input.equals("exit")) {
				break;
			}
			
			int number = Integer.parseInt(input);
			if(number < 0) {
				continue;
			}
			
			System.out.println("You entered a positive number.");
			
		} while(true);
		
		scanner.close();
		System.out.println("The program exited.");
	}

}
