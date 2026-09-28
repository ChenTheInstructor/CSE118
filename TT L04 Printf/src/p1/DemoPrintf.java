package p1;

public class DemoPrintf {

	public static void main(String[] args) {
//		int x = 10;
//		int y = 5;
//		x *= 3; // x = x * 3; x = 30
//		y %= 2; // y = y % 2; y = 1;
//		
//		int z = x-- + --y;
//		
//		System.out.println(z);// preincrement/postincrement
//		System.out.println(x);
//		System.out.println(y);
		
		String formatString = "\t|%-5s|%-20S|%10s|%15d|%15.3f|%n";
		int serialNumber = 1;
		int n = 1;
		
		String name1 = "Adam John Smith";
		String id1 = "11234567";
		int age1 = 18;
		double gpa1 = 3;
		
		String name2 = "Bill";
		String id2 = "10765431";
		int age2 = 19;
		double gpa2 = 3.67;
		
		System.out.printf(formatString, serialNumber++, (name1 + n++), id1, ++age1, gpa1);
		System.out.printf(formatString, serialNumber++, (name2 + n++), id2, ++age2, gpa2);
	}

}
