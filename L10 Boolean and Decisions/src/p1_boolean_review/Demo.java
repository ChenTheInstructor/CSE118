package p1_boolean_review;

import java.util.Random;

/*
 * Boolean Expression:
 * Leads to either true or false
 * Boolean operators:
 * > greater than
 * < less than
 * >= greater than or equal to
 * <= less than or equal to
 * == equal to
 * != not equal to
 * 
 * Example:
 * int a = 20;
 * int b = 10;
 * boolean c = a < b;
 * 
 * 
 *Logical Operators:
 *To combine two or more boolean expressions
 *	&&  AND
 *	||  OR
 *	!  	NOT
 *
 *	int a = 10;
 *	 int b = 20;
 *	int c = 30;
 *	boolean d = a > b && c > a // more efficient
 *	boolean d = a < b & c > 1
 *	boolean d = !(a == b); // false
 */

public class Demo {
	public static void main(String[] args) {
//		int a = 20;
//		int b = 10;
////		boolean c = a > b;
//		System.out.println(2.5 > 1.9);
		
// reference type comparisions
		String str1 = "Aa";
		String str2 = new String("Az");
		Random rand = new Random();
		int n1 = rand.nextInt();
		int n2 = rand.nextInt();
		System.out.println(n1 > n2);
//		System.out.println(str1.charAt(0) == str2.charAt(0));
	}
}
