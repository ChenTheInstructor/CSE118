package p2_augumented_assignment_operators;

public class Main {

	public static void main(String[] args) {
		int n = 10; // = means assignment, not equality
		System.out.println(n);
//		n = n + 5;
//		n += 5;// augumented assignment
//		n -= 5; // n = n -5;
//		n *= 5; // n = n * 5;
//		n /= 5; // n = n / 5;
//		n %= 3; // n  = n % 3;
		
		// keep in mind the augumented operators are always run the last
		n += 5 - 2; // n = n + (5 + 2);
		System.out.println(n);
	}

}
