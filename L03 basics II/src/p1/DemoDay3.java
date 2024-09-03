package p1;

public class DemoDay3 {
	public static void main(String[] args) {
		// input: get data into the program
		int age = 20;

		// process: process the data to obtain result
		age = age + 1;
		double halfAge = age / 2.0;
		int remainder = age % 2; // % modulus

		// output: display the result
//		System.out.println("Your age is:                 " + age); // \n is treated as new line or nextline
//		System.out.println("Your half age is: " + halfAge);
//		System.out.println("The remainder of " + age + " divided by 2 is " + remainder + ".");
//		System.out.println("Next year you'll be " + nextYearAge);
		char c = '*';
		System.out.println("      " + c + "\n    " + c + "  " + c + "\n   " +c + c + c + c + c + c + "\n  " + c
				+ "      " + c + "\n " + c + "        " + c);
//		System.out.println("     A  A");
//		System.out.println("    AAAAAA");
//		System.out.println("   A      A");
//		System.out.println("  A        A");

	}
}
