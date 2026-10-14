package p1;

public class Demo {

	public static void main(String[] args) {
		int score = 60; // hard coded data

		if (score > 60) {
			if (score > 90) {
				System.out.println("You got an \"A\"!");
			}
			System.out.println("You passed the course.");
			System.out.println("Congrats!");
			System.out.println("Good luck next time.");
		} else {
			if(score < 20) {
				System.out.println("That is kind of low!");
			}
			System.out.println("You failed. Work harder!");
		}
		
		System.out.println("Enjoy your day!");
	}

}
