package p1;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {

		showRandomInt();
		greetings(2, "Have a nice day!"); // arguments
		int n = getRandomInt(2, 10);
		if (n % 2 == 0) {
			System.out.println(n + " is an even number.");
		} else {
			System.out.println(n + " is an odd number.");
		}

//		System.out.println(Math.sqrt(2));
//		System.out.println(Math.pow(4,  3));
//		System.out.println(Math.ceil(12.0456));
//		System.out.println(Math.min(20, 40));
		////		
//		
//		
//		Math.random()// where random() is a static method, which uses the class name directly
//		Random rand = new Random(); 
//		rand.nextInt() // an instance method requires an object of the class.
//		
//		Random rand = new Random();
//		int count = 0;
//		for (int i = 0; i < 100; i++) {
//			
//			int num = rand.nextInt(50, 101);
//			if(num == 100) {
//				System.out.println(num + ": " + ++count);
//			}
//		}

//		int count = 0;
//		for (int i = 0; i < 1000; i++) {
//			int num = (int)(Math.random() * 101) + 100;
//			if(num == 100) {
//				System.out.println(num + ": " + ++count);
//			}
//		}
	}

	public static void greetings(int n, String s) { // parameters
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
	}

	public static int getRandomInt(int min, int max) {
		Random rand = new Random();
		int number = rand.nextInt(min, max+1);
		return number;
//		System.out.println(number);
	}

	public static void showRandomInt() {
		Random rand = new Random();
		int number = rand.nextInt(50, 101);
		System.out.println(number);
	}

}
