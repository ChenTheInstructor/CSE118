package p9;

public class Demo {

	public static void main(String[] args) {
		Movie m1 = new Movie("GodFather", "Crime", 180);
		System.out.println("Is " + m1.getTitle() + " a long movie? " + m1.isLongMovie());
		
		Movie m2 = new Movie("Good Fellows", 146);
		System.out.println("Is " + m2.getTitle() + " a long movie? " + m2.isLongMovie());
		
		Movie m3 = new Movie("Lord of the rings");
		m3.setDurationInMinutes(178);
		System.out.println("Is " + m3.getTitle() + " a long movie? " + m3.isLongMovie());
	}

}
