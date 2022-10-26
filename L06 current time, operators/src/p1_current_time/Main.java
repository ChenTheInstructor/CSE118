package p1_current_time;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		String name = "Joe";
//		Scanner kb = new Scanner(System.in);// System.in is called argument
		long milliseconds = System.currentTimeMillis();//currentTimeMillis() is called method
		// display the number of milliseconds that has passed since January 1, 1970.
		long time1 = System.nanoTime();
		long seconds = milliseconds / 1000;
		System.out.println("The number of seconds passed since...: " + seconds);
		
		long minutes = seconds / 60;
		System.out.println("The number of minutes passed since...: " + minutes);
		
		long hours = minutes / 60;
		System.out.println("The number of hours passed since...: " + hours);
		
		long days = hours / 24;
		System.out.println("The number of days passed since...: " + days);
		
		System.out.println("Current hour: " + hours % 24);
		System.out.println("Current minutes: " + minutes % 60);
		System.out.println("Current seconds: " + seconds % 60);
		
//		System.out.println(milliseconds - System.currentTimeMillis());
		System.out.println(System.nanoTime() - time1);
		
		
	}

}
