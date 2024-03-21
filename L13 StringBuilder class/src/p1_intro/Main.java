package p1_intro;

public class Main {

	public static void main(String[] args) {
		String name = "Suzy";
		name = "Suzy" + "Sue";// String object is immutable
		
		StringBuilder sb = new StringBuilder("Suzy");
		sb.append(" sue "); // not immutable
		
		
	}

}
