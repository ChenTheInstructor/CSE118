package p6_total_digits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a whole number: ");
//		String numStr = scanner.nextLine();
		String numStr = "423";
		int total = 0;
		
		for(int i = 0; i < numStr.length(); i++) {
			char c = numStr.charAt(i); 
			int num = Integer.parseInt(String.valueOf(c));
			total += num;
		}
		
		System.out.println("The total: " + total);
	}

}
