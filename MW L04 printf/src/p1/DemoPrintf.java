package p1;

public class DemoPrintf {

	public static void main(String[] args) {
		// f is for format
		int n = 0;
		// n++ post increment: use n as is then add 1 to n
		// ++n pre increment: add 1 to n first then use n
		System.out.printf("\t%-15s%20s%20s%n", "Item Number", "Item Desc", "Price");
		System.out.printf("\t%-15d%20S%20.2f%n", ++n, "Beef", 19.99);
		System.out.printf("\t%-15d%20S%20.2f%n", ++n, "Eggs", 9.493456);
		System.out.printf("\t%-15d%20S%20.2f%n", ++n, "Soup", 3.0924356);
	}

}
