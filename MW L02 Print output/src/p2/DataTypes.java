package p2;

public class DataTypes {

	public static void main(String[] args) {
		String greetings = "hi"; // Declare a variable named greetings of the String type
		System.out.println(greetings); // A variable is a label for a memory location where 
										// data can be stored by using the = sign.
		
		int n = 5; // the whole number ranges -2.1b to +2.1b. Because Java uses 4 bytes (32bits) to store an int value
		double gpa = 1.456789;
		System.out.println(Short.MAX_VALUE + "  ---  " + Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE + "  ---  " + Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE + "  ---  " + Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE + "  ---  " + Double.MIN_VALUE);
		System.out.println(Float.MAX_VALUE + "  ---  " + Float.MIN_VALUE);
	}

}
