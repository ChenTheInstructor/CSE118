package p2_coding_problems;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
//		char ch = 'A';
//		System.out.println((int)ch);
//		System.out.println((char)99);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String str = scanner.nextLine();
		char ch = str.charAt(0);
		System.out.println(ch);
		
	}

}
