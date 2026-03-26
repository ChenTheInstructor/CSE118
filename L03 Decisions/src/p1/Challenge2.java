package p1;

public class Challenge2 {

	public static void main(String[] args) {
		int a = 50;
		int b = 90;
		int c = 70;
		
		if(a >= b && a <= c || a <= b && a >= c) {
			System.out.println("The middle one is " + a);
		} else if(b >= a && b <= c || b <= a && b >= c) {
			System.out.println("The middle one is " + b);
		} else {
			System.out.println("The middle one is " + c);
		}
	}

}
