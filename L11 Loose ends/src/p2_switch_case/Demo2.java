package p2_switch_case;

public class Demo2 {

	public static void main(String[] args) {
		double n = 3; // no double. only int, char, String, long, short
		
		switch(n) {
		case > 2: 					// in each case, no range of values allowed
			System.out.println("It's 1.");
			break;
		case 2.0:
			System.out.println("It's 2.");
			break;
		case 3.0:
			System.out.println("It's 3.");
			break;
		default:
			System.out.println("Not 1, 2, or 3.");
		}
	}

}
