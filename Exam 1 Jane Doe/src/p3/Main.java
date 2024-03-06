package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1 = scanner.nextLine();
		System.out.println("Enter string 2: ");
		String str2 = scanner.nextLine();
		
		System.out.println(str1.contains(str2));
	}

}
