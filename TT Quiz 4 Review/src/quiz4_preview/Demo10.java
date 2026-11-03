package quiz4_preview;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total  = 0;
		do {
			System.out.print("Enter an integer (0 to quit): ");
			int num = scanner.nextInt();
			if(num == 0) {
				break;
			}
			total += num;
		} while (true);
		
		System.out.println("The total is: " + total);

	}

}
