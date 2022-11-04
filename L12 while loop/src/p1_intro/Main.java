package p1_intro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.println("Hi");
//			System.out.println("Say Hi again?");
//			String answer = scanner.nextLine().toLowerCase();
//			if(answer.charAt(0) == 'n') {
//				break;
//			}
//			
//		}
		String answer = "y";
		while(answer.charAt(0)=='y') {
			System.out.println("Hi");
			System.out.println("Say Hi again?");
			answer = scanner.nextLine().toLowerCase();
		}
		
		System.out.println("end");
	}

}
