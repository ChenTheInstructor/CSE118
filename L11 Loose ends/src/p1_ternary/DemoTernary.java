package p1_ternary;

public class DemoTernary {

	public static void main(String[] args) {
		int x = 5;
		int y = 5;
//		int max = (x < y) ? y : x;
//		System.out.println(max);
		String max = (x == y)?"The same":(x > y)? "X is bigger" : "y is bigger";
		System.out.println(max);
	}

}
