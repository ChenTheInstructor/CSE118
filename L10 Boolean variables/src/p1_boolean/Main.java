package p1_boolean;

public class Main {

	public static void main(String[] args) {
		// short long int boolean char float double byte
		// two values total: true or false
		boolean isHot = false;
		
		// boolean expression: an expression that leads to a boolean value
		int a = 10;
		int b = 20;
		
//		char a = 'A';
//		char b = 'a';
//		boolean aSmaller = a < b;
//		System.out.println(aSmaller);
		
		// relational Operators:
		// <, >, <=, >=, ==, !=
//		System.out.println((int)'A');
//		System.out.println((int)'a');
//		System.out.println(a < b);
//		System.out.println(a <= b);
//		System.out.println(a > b);
//		System.out.println(a >= b);
//		System.out.println( a == b);
//		System.out.println(a != b);
		// Logical operators: used to combine multiple boolean expressions
		// && (AND), || (OR), !(NOT)
		//1: &&:true only if both expressions are true
		//  a < b && a <= b
//		System.out.println(a + 1 == 12 && a > b);
		
		// 2. || OR
		// It is true if either one of two expressions is true
//		System.out.println(a > b || a == 20);
		
		//3. ! (NOT)
		// It negates the boolean expression behind it
//		System.out.println(!(a > b));
		
		System.out.println(!(a > b) && 'A' < 'a' || 'A' == 'B');
		
	}

}
