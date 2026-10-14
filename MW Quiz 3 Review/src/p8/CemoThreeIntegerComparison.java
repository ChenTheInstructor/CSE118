package p8;

import java.util.Scanner;

public class CemoThreeIntegerComparison {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int largerOfTwo = Integer.MIN_VALUE;
		if(a == b) {
			System.out.println("Equal");
		} else if (a > b) {
			System.out.println("First is larger");
			largerOfTwo = a;
		} else {
			largerOfTwo = b;
			System.out.println("Second is larger");
		}
		
		System.out.print("Enter the third number: ");
		int c = input.nextInt();
		
		if(c > largerOfTwo) {
			System.out.println("c is above the larger value of a and b");
		} else if( c == largerOfTwo){
			System.out.println("c is the same as the larger value of a and b");
		} else {
			System.out.println("c is smaller than the larger value of a and b");
		}
		
		System.out.println(a + "\t" + b +"\t" + c);
	}

}
