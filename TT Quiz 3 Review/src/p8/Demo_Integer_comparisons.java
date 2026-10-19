package p8;

import java.util.Scanner;

public class Demo_Integer_comparisons {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: "); // prompt
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a > b) {
			System.out.println("First is larger");
		} else if (a < b) {
			System.out.println("Second is larger");
		} else {
			System.out.println("Equal");
		}
		
	}

}
