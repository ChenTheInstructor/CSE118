package p2_if;

public class Demo {
	/*
	 * syntax:
	 * 	if(condition) {
	 * 		if code block
	 * }
	 */

	public static void main(String[] args) {
		char a = 'a';
		char b = 'a';
		if(a < b) {
			System.out.println(a + " is smaller than " + b);
		} else if (a == b){
			System.out.println(a + " equals " + b);
		} else {
			System.out.println(a + " is greater than " + b);
		}
		System.out.println("End");
	}

}
