package pre_quiz_review;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= 12; i++) {
			System.out.print(n + " * " + i + " = " + (n * i) + "\t");
		}
		System.out.println("\n\n");
		
		for(int i = 1; i <= 12; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

}
