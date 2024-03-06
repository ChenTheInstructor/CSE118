package p2_if;

public class Main {

	public static void main(String[] args) {
		int temperature = 60;

		if (temperature >= 90) {
			System.out.println("It's hot.");
			System.out.println("We need to change our room.");
		} else if (temperature >= 80) {
			System.out.println("It's not hot but quite warm.");
			System.out.println("We probably want to change our room.");
		} else if (temperature >= 70) {
			System.out.println("It's not bad. We will stay.");
		} else {
			System.out.println("It's pretty cool.");
		}

		System.out.println("The end");
	}

}
