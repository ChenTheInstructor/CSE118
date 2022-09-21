package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = kb.nextLine();
		System.out.println("The name entered is: " + name);
		
		System.out.println("Enter your age: ");
		int age = kb.nextInt();
		System.out.println("The age entered is: " + age);
		
		kb.nextLine();
		System.out.println("Enter your major: ");
		System.out.println("The major entered is: " + kb.nextLine());
		
//		Scanner kb1 = new Scanner(System.in);
//		Scanner kb2 = new Scanner(System.in);
//		boolean b = kb1 == kb2;
//		
//		boolean kb3 = b;
//		
//		System.out.println(kb3 == b);
//		
		
//		System.out.println(b);
//		String name1 = new String("Joe");
//		String name2 = new String("Joe");
//		System.out.println(name1 == name2); // comparing the addresses
//		System.out.println(name1.equals(name2));// comparing the string content not addresses
		
//		int n1 = 100;
//		System.out.println(n1);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
//		long n2 = 100;
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		
//		short n3 = 100;
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		
//		double n4 = 1.5;
//		System.out.println(Double.MAX_VALUE);
//		System.out.println(Double.MIN_VALUE);
//		
//		float n5 = 1.5f;
//		System.out.println(Float.MAX_VALUE);
//		System.out.println(Float.MIN_VALUE);
//		
//		char c1 = 'A';
//		
//		boolean b1 = true;
//		b1 = false;
		
		
	}

}
