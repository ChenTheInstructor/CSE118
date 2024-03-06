package p5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first full name: ");
		String name1 = scanner.nextLine();
		System.out.println("Enter the second full name: ");
		String name2 = scanner.nextLine();
		
		String[] name1Arr = name1.split(" ");
		String[] name2Arr = name2.split(" ");
		System.out.println(name2Arr[0] + " " + name1Arr[1]);
		System.out.println(name1Arr[0] + " " + name2Arr[1]);
		
		
//		String firstName1 = name1.substring(0, name1.indexOf(" "));
//		String lastName1 = name1.substring(name1.indexOf(" ") + 1);
//		
//		String firstName2 = name2.substring(0, name1.indexOf(" "));
//		String lastName2 = name2.substring(name1.indexOf(" ") + 1);
//		
//		System.out.println(firstName2 + " " + lastName1);
//		System.out.println(firstName1 + " " + lastName2);
		
		
	}

}
