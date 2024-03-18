package p3_assignment_operators;

public class Main {

	public static void main(String[] args) {
//		int a = 10; // 10 = a
//		a += 5; // a = a + 5;
//		a -= 2; // a = a - 2;
//		a *= 2; // a = a * 2;
//		a /= 2;  // a = a / 2;
//		
//		boolean b = 2 < 3; // true
//		b &= (3 == 2); 	// b = b && (3 == 2)  b: false
//		
//		b |= (3 >= 2); 	// b = b || 3 >= 2;
//		
//		System.out.println(b);
		
		// exclusive OR (^)
		System.out.println(true ^ true); //false
		System.out.println(false ^ false); //false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		
		System.out.println((2 > 3) ^ (3 < 4));
	}

}
