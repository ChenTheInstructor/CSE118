package p1;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		double b = a;
//		System.out.println(b);
		
		double aa = 10.9;
		int bb = (int)aa; // casting
//		System.out.println(bb);
		
		char c = 'A';
		int d = c;
//		System.out.println(d);
		
		int e = 66;
		char f = (char)e;
//		System.out.println(f);
		
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(1.5);
//		System.out.println(str2 + str1);
//		System.out.println(str1 + 5);
		String booleanStr = String.valueOf(false);
		System.out.println(booleanStr + " Hello");
		
	}

}
