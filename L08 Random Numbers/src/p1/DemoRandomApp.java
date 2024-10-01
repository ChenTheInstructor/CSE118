package p1;

import java.util.Random;

public class DemoRandomApp {

	public static void main(String[] args) {
//		String str1 = "123";
//		String str2 = "123";
//		System.out.println(str1 + str2);
		// There is a connection between any character and a whole number
		// A table known as ASCII table lists the relationship for commonly used english characters
//		System.out.println('A');
		Random rand = new Random();
		System.out.println((char)rand.nextInt(97, 123));
		
		for (int i = 0; i < 10; i++) {
			String randStr = "" + (char) rand.nextInt(65, 91) + (char) rand.nextInt(97, 123)
					+ (char) rand.nextInt(97, 123) + (char) rand.nextInt(97, 123) + (char) rand.nextInt(97, 123);
			System.out.println(randStr);
		}
	}

}
