package p6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a full name: ");
		String name = scanner.nextLine();
		System.out.println(name.substring(0, name.indexOf(" ")).length());
		System.out.println(name.substring(name.indexOf(" ") + 1).length());
		
	}

}
