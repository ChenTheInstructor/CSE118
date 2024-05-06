package p01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
// write a program that would ask the user for 4 names. Then display
	// them. Use separate methods to get the names and display them.
	// Your main method would call these two methods to complete the task
	
	public static void main(String[] args) {
		// Call the two methods to complete the task
		String[] names = getNames(5);
		displayNames(names);
	}
	
	public static String[] getNames(int n) {
		Scanner scanner = new Scanner(System.in);
		String[] names = new String[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter name " + (i + 1) + ": ");
			names[i] = scanner.nextLine();
		}
		
		return names;
	}
	
	public static void displayNames(String[] names) {
//		System.out.println(Arrays.toString(names));
//		for(String n : names) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}

}
