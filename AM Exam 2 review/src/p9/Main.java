package p9;

public class Main {

	public static void main(String[] args) {
		Movie m1 = new Movie("GodFather", "Crime", 200);
		System.out.println(m1);
		System.out.println("Is it a long movie? " + m1.isLongMovie());
		
		Movie m2 = new Movie("Good Fellows", "Crime", 148);
		System.out.println(m2);
		System.out.println("Is it a long movie? " + m2.isLongMovie());
		
		Movie m3 = new Movie("GodFather");
		m3.setDurationInMinutes(300);
		System.out.println(m3);
		System.out.println("Is it a long movie? " + m3.isLongMovie());
	}

}
