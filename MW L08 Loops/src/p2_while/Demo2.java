package p2_while;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an positive integer: ");
		int n = input.nextInt();
		
		while(n >= 1) {
			System.out.print(n++ + " "); // pre-decrement
//			n--;
		}
	}

}
