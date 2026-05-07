package p1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// Declare a regular int variable named age and store the value 20 at the
		// location
		int age; // variable declaration. What is stored there?
//		System.out.println(age);
		age = 20; // never do 20 = age;

		int age2 = 20;

		// Declare an array of int type:
		int[] ages; // int ages[]; ages is meant to store the address of an int array object

		// What is stored at the location ages? Zero?
		ages = new int[20]; // an int arrays is actually created. Its address is stored at ages

		// Once an array is created, it is populated with default values.
		// To show the content of an array, you may use the built-in "Arrays" class
//		System.out.println(Arrays.toString(ages));

		// or you may display each element in the arrays separately:
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println(ages[4]);

		System.out.println("-----------------------");
		for (int i = 10; i < ages.length / 2; i++) {
			System.out.print(ages[i] + ", ");
		}

		System.out.println("\n------------------------");
		// in addition, you may use enhanced for loop for display the entire array
		for (int a : ages) {
			System.out.print(a + ", ");
		}

		System.out.println("\n-------------------");
//		System.out.println(ages[5]); // no compilation error but crashed at running, runtime error
		// bounds of an array is always from 0 to the array length - 1
//		System.out.println(ages);

		// Create a String array of size 5
		String[] names1 = new String[10];
		names1[0] = "A";
		names1[1] = "B";
		names1[2] = "C";
		names1[3] = "D";
		names1[4] = "E";
		System.out.println("names1 length: " + names1.length);
		for (int i = 0; i < names1.length; i = i + 2) {
			System.out.print(names1[i] + " ");
		}
		System.out.println("\n------------------------------");

//		
		String[] names2 = { "A", "B", "C", "D", "E", "F" };
		System.out.println("names2 length: " + names2.length);
//		names[-1] = "F";
//		System.out.println(Arrays.toString(names2));

		int index = 0;
		for (String n : names2) {
			if (index % 2 == 0) {
				index++;
				continue;
			}
			System.out.print(n + " ");
			index++;
		}
		System.out.println("\n---------------------------------");
	}
}
