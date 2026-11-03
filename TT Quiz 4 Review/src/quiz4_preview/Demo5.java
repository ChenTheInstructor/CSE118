package quiz4_preview;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= 12; i++) {
			System.out.println(n +" x " + i + " = " + (n * i));
		}
	}

}
