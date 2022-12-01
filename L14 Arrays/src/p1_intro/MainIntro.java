package p1_intro;

public class MainIntro {

	public static void main(String[] args) {
		// an array allows you to store multiple values of the same type in a single
		// variable

		// how to create an array
		// Method 1:
		String[] names = new String[5]; // create an empty array
		names[0] = "Alan";
		names[1] = "Bill";
		
		for(String str : names) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// Method 2:
		String[] cities = { "Selden", "Centereach", "Stony Brook" };
		
		// ways to display the content of an array
		for (int i = 0; i < cities.length; i++) { // regular for-loop
			System.out.println(cities[i]);
		}
		
		for(String s : cities) { // enhanced for-loop
			System.out.println(s);
		}
	}

}
