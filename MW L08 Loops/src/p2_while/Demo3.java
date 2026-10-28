package p2_while;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		int count = 0;
		
		while (true) {
			System.out.println("Enter an integer or -1 to quit: ");
			number = input.nextInt();
			if(number != -1) {
				count++;
				continue;// skip the rest statement and start a new iteration
			}
			
			break;// break out of the loop altogether
		}
		System.out.println("The number of numbers entered before -1 is: " + count);
		
		
		
//		while (true) {
//			System.out.println("Enter an integer or -1 to quit: ");
//			number = input.nextInt();
//			if (number != -1) {
//				count++;
//
//			} else {
//				break;
//			}
//		}
//
//		System.out.println("The number of numbers entered before -1 is: " + count);

//		while(number != -1) {
//			System.out.println("Enter an integer or -1 to quit: ");
//			number = input.nextInt();
//			count++;
//		}
//		
//		System.out.println("The number of numbers entered before -1 is: " + count);

//		do {
//			System.out.println("Enter an integer or -1 to exit: ");
//			number = input.nextInt();
//			count++;
//		} while(number != -1);
//		System.out.println("The number of numbers entered before -1 is: " + count);
	}

}
