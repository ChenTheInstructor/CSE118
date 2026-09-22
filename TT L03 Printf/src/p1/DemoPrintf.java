package p1;

public class DemoPrintf {

	public static void main(String[] args) {
		String header = "\n\n\t%-15S%15S%10S%n";
		String line = "\t%40s%n";
		String item = "\t%-15d%15s%10.2f%n";
		String underscores = "________________________________________";
		int itemNum = 0;
		// itemNum++: post increment: use itemNum as is and then increment by 1
		// ++itemNum: pre increment: increment itemNum by 1 before use it
		
		System.out.printf(header, "Item Number", "Item Desc", "Price");
		System.out.printf(line, underscores);
		System.out.printf(item, --itemNum, "Beef", 19.99);
		System.out.printf(item, --itemNum, "Fish", 29.99);
		System.out.printf(item, --itemNum, "Pork", 14.99);
		System.out.printf(item, --itemNum, "Eggs", 4.99);
		System.out.printf(item, --itemNum, "Salad", 9.99);
		System.out.printf(line, underscores);
	}

}
