package p5;

public class Main {

	public static void main(String[] args) {
		System.out.println(findMax(4, 2, 7));
	}

	public static double findMax(double a, double b, double c) {
//		if(a > b && a > c) {
//			return a;
//		} else if(b > a && b > c) {
//			return b;
//		} else {
//			return c;
//		}

		double max = a;
		
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		
		return max;
	}

}
