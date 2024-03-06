package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a full name: ");
		String name = scanner.nextLine();
		String[] names = name.split(" ");
		System.out.println(names[0].toLowerCase());
		System.out.println(names[1].toUpperCase());
		
//		System.out.println(name.substring(0, name.indexOf(" ")).toLowerCase());
//		System.out.println(name.substring(name.indexOf(" ") + 1).toUpperCase());
	}

}
