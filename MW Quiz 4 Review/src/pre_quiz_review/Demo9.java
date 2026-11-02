package pre_quiz_review;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		String realPass = "1234";

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\nEnter your password: ");
			String userPass = scanner.nextLine();

			if (userPass.equals(realPass)) {
				System.out.println("Access Granted.");
				break;
			}
		} while (true);

	}

}
