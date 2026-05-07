package p1;

public class ArrayDemo {

	public static void main(String[] args) {
		// create a String array named names that is big enough to store five names
		String[] names;
		names = new String[5];
		names[0] = "Adam";
		names[names.length - 1] = "Bill";
		names[names.length - 1] = "Jose";
		names[0] = names[names.length - 1];
		names[1] = "Cathy";
		names[2] = "David";
		names[3] = "Suzy";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("The following is produced by enhanced for-loop:");
		for(String name : names) {
			System.out.print(name + " ");
		}
	}

}
