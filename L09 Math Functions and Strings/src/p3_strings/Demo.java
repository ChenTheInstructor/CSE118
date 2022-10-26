package p3_strings;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		final int MIN_PASSWORD_LENGTH = 8;
		String str = "Hello World!";
//		System.out.println(str.length());
//		System.out.println(str.charAt(str.length()-1));
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		System.out.println(str.compareTo("hello world"));
//		System.out.println("A".compareTo("B"));
//		System.out.println("Hello".equals("hello"));
		
//		String str1 = " "; // empty string
//		System.out.println(str1.isBlank());
//		System.out.println(str1.isEmpty());
		
		String str2 = "Hello World Friend";
//		System.out.println(str2.contains("el"));
//		int firstSpace = str2.indexOf(" ");
//		String remaining = str2.substring(firstSpace + 1);
//		int secondSpace = remaining.indexOf(" ") + firstSpace+1;
//		String secondWord = str2.substring(firstSpace+1, secondSpace+1);
//		System.out.println(secondWord);
		
//		int firstSpace = str2.indexOf(" ");
//		int secondSpace = str2.indexOf(" ", firstSpace+1);
////		System.out.println(secondSpace);
//		String secondWord = str2.substring(firstSpace+1, secondSpace);
//		System.out.println(secondWord);
//		
//		int thirdSpace = str2.indexOf(" ", secondSpace+1);
//		String thirdWord ="";
//		if(thirdSpace == -1) {
//			thirdWord = str2.substring(secondSpace+1);
//		}
//		System.out.println(thirdWord);
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a username: ");
//		String userName = scanner.nextLine();
//		if(userName.length() < 8) {
//			System.out.println("The user name is less than 8 characters.");
//		} else if(userName.isBlank()) {
//			System.out.println("The user name is blank");
//		} else if (userName.contains(" ")){
//			System.out.println("The user name contains a space.");
//		} else {
//			System.out.println("Seems fine");
//		}
//		
//		System.out.println("Enter a password: ");
//		String password1 = scanner.nextLine();
//		System.out.println("Enter a password again: ");
//		String password2 = scanner.nextLine();
//		
//		if(!password1.equals(password2)) {
//			System.out.println("The passwords entered do not match.");
//		} else if(password1.length() < MIN_PASSWORD_LENGTH){
//			System.out.println("Password too short.");
//		} else if(password1.equals(password1.toLowerCase())) {
//			System.out.println("No uppercase letters.");
//		} else if(password1.equals(password1.toUpperCase())) {
//			System.out.println("No lowercase letters.");
//		} else if(!(password1.contains("0") || password1.contains("1") || password1.contains("2") || password1.contains("3"))){
//			System.out.println("No digit");
//		}
		
		// convert a number into a string
//		double n1 = 1.1;
//		String s1 = String.valueOf(n1);
//		double n2 = 2.2;
		
//		String s2 = String.valueOf(n2);
		
//		System.out.println(s1 + s2);
		
		// convert a string into a number
//		String s3 = "3";
//		int d1 = Integer.parseInt(s3);
//		String s4 = "2";
//		int d2 = Integer.parseInt(s4);
//		System.out.println(d1+ d2);
		
		double n = 123.4567789;
		System.out.println(String.format("%6.2f", n));
	}

}
