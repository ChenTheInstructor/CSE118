package p1_while_loop;

import java.util.Scanner;

public class ShowNumbersDemo {

	public static void main(String[] args) {
		String passwordReal = "Secret";
		String usernameReal = "johnDoe";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username and password: ");
		String usernameEntered = scanner.next();
		String passwordEntered = scanner.next();
		
		while(!passwordEntered.equals(passwordReal) || (!usernameEntered.equals(usernameReal))) {
			System.out.println("Either username or password is incorrect. Enter them again: ");
			usernameEntered = scanner.next();
			passwordEntered = scanner.next();
		}
		
//		while(true) {
//			if(passwordEntered.equals(passwordReal) && usernameEntered.equalsIgnoreCase(usernameReal)) {
//				break;
//			}
//			
//			System.out.println("Either username or password entered is incorrect. Enter the correct ones: ");
//			usernameEntered = scanner.next();
//			passwordEntered = scanner.next();
//				
//		}
		
		System.out.println("The username and password entered are correct!");
		
//		while(n >= 0) {
//			System.out.println(n);
////			n = n - 1;
////			n -= 1; // n = n -1;
////			n--;
//			--n;
//		}
		
//		while(true) {
//			System.out.println(n);
//			n--;
//			if(n < 0) {
//				break;
//			}
//		}
	}

}
