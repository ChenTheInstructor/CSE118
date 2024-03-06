package p2_example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is this room hot? (enter true or false) ");
		boolean isHot = scanner.nextBoolean();
//		System.out.println("This room is hot? " + isHot);
		
		if(isHot) {
			System.out.println("We will move to a different room.");
		} else {
			System.out.println("We will stay in the same room.");
		}
	}

}
