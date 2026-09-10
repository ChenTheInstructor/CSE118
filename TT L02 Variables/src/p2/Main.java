package p2;

public class Main {

	public static void main(String[] args) {
		// Reference types
		String v1 = "Hi"; // String type variable
		
		
		// Primitive types
		// 1: int: 4 bytes. -2.1B -- +2.1B
		int v2 = 10; // narrowing, has to lose precision, so not allowed
		
		int v2_2 = (int)100.1; // casting: cast a real number as an integer
		
		// 2. double
		double v3 = 10; // widening, not losing precision so allowed
		
		// 3. char
		char v4 = 'A';
		
		// 4. boolean
		boolean v5 = true;
		
		// uncommon
		// 5. short: 2 bytes -32,000 +32,000
		// 6. byte: 1 byte: -128  0  +127
		// 7. long: 8 bytes
		// 8. float: 4 bytes, real numbers in a smaller range
		
		System.out.println(Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
//		System.out.println(v4);
//		System.out.println(v5);
	}

}
