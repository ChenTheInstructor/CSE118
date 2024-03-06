package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// asks for a full-name. Prints first name and last name on two lines
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = scanner.nextLine();
		
		String[] names = name.split(" ");
		System.out.println(names[0]);
		System.out.println(names[1].charAt(0));
		System.out.println(names[2]);
		
//		
//		int indexFirstSpace = name.indexOf(" ");
//		int indexLastSpace = name.lastIndexOf(" ");
//		
//		System.out.println("First name: " + name.substring(0, indexFirstSpace));
//		System.out.println("Middle Initial: " + name.charAt(indexFirstSpace+1));
//		System.out.println("Last Name: " + name.substring(indexLastSpace + 1));
		
		// use an array: a series of strings
//		String[] names = name.split(" ");
//		System.out.println(names[0]);
//		System.out.println(names[1]);
		
//		int spaceIndex = name.indexOf(" ");
//		System.out.println(name.substring(0, spaceIndex));
//		System.out.println(name.substring(spaceIndex + 1));
		
		// asks the user for full name, prints first name, 
		// middle initial and last name in three lines
	}

}
