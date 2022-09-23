package p3_type_casting;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int number1 = 5;
//		double number2 = number1;
//		System.out.println(number1);
//		System.out.println(number2);
		
		//type casting
//		double number3 = 1.5;
//		int number4 = (int)(number3 + number3);
//		System.out.println(number4);
		
		// operator %: modulus --> remainder
//		System.out.println((double)1 / 2);
//		System.out.println(1 * 1.0 / 2);
//		System.out.println(1 / 2 * 1.0);
		
//		System.out.println(4.5 % 10);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the total dollar amount:");
		double total = kb.nextDouble();
		int hundreds = (int)total / 100;
		System.out.println("100s: " + hundreds);
		
		double theRest = total - hundreds * 100;
		int fiftys = (int)theRest / 50;
		System.out.println("50s: " + fiftys);
		
		theRest = theRest - fiftys * 50;
		int twentys = (int)theRest / 20;
		System.out.println("20s: " + twentys);
		
		theRest = theRest - twentys * 20;
		int tens = (int)theRest / 10; 
		System.out.println("10s: " + tens);
		
		theRest = theRest - tens * 10;
		int singles = (int)theRest;
		System.out.println("1s: " + singles);
		
		System.out.println("cents: " + theRest % 1);
		
	}

}
