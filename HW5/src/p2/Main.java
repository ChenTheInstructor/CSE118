package p2;

import java.util.Scanner; // java.util library

public class Main {

	public static void main(String[] args) {
		Scanner kb;
		kb = new Scanner(System.in);
//		System.out.println("Enter first name: ");
//		String firstName = kb.nextLine();
//		System.out.println("Enter last name: ");
//		String lastName = kb.nextLine();
		
		System.out.println("Enter first name and last name separated by a space: ");
		String firstName = kb.next();
		String lastName = kb.nextLine().trim();
		
		
//		char firstInitial = firstName.toLowerCase().charAt(0);
//		char lastInitial = lastName.toLowerCase().charAt(0);
		
		System.out.println("The first name is:" + firstName);
		System.out.println("The last name is:" + lastName);
	}

}
