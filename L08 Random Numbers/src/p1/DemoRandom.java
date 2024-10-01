package p1;

import java.util.Random;

public class DemoRandom {

	public static void main(String[] args) {
		// A class is a reference data type
		// rad (variable) is a reference variable.
		// rad is used to store the address of a Random object
		// The random object is located on the heap
		// new is an operator used to create the object
		Random rad = new Random();
		// A Random object is now created
		// WHy do we need a Random object? So we can use methods to do things
		// Here are the list of methods one can use with a Random object:
		// nextDouble()
		// nextInt()
		// for example:
//		double d1 = rad.nextDouble(); // return a random double 
//		System.out.println(d1);		//between 0.0 (inclusive) and 1.0 (exclusive)
		
//		double d2 = rad.nextDouble(5); // 5 sets the upperbound, not included
//		System.out.println(d2);
		
//		double d3 = rad.nextDouble(5, 10); // return a random double between 5.0 inclusive
//		System.out.println(d3);			// and 10.0 exclusive
		
//		int n1 = rad.nextInt();
//		System.out.println(n1); // return a random whole number within a wide range
		
		
		// return a whole number ranging from 0 inclusive to 10 exclusive
//		for (int i = 0; i < 50; i++) { 
//			int n2 = rad.nextInt(10);
//			System.out.print(n2 + " ");
//		}
		
		for (int i = 0; i < 10; i++) {
			// return a whole number ranging from 10 inclusive to 15 exclusive
			int n3 = rad.nextInt(10, 15);
			System.out.println(n3);
		}
	}

}
