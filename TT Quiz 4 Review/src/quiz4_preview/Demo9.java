package quiz4_preview;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Enter your password: ");
			String userPass = scanner.nextLine();
			if(userPass.equals("1234")) {
				System.out.println("Access Granted.");
				break;
			}
		} while(true);
	}

}
