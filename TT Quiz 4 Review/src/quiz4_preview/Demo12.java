package quiz4_preview;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = scanner.nextInt();
		boolean found = false;
		for(int i = n; i <= 100; i++) {
			if(i % 7 == 0) {
				found = true;
				System.out.println("The first multiple of 7 is " + i);
				break;
			}
		}
		if(!found) {
			System.out.println("No multiple of 7 found");
		}
	}

}
