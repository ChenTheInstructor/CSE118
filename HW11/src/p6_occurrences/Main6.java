package p6_occurrences;

public class Main6 {

	public static void main(String[] args) {
		int[] numbers = {3, 1, 6, 9, 2, 6, 2, 2, 1, 6};
		String[] names = {"Bill", "Suzie", "Alan", "Bill", 
				"Bill", "Zack", "Liz", "Lisa", "Muhammud", "Jose"};
		
		int target = 10; // 4 bytes
		String targetName = "Bill";
		
		System.out.println("Name Occurrences: " + calculateOccurrences(names,targetName));
		
//		double gpa = 4.0; // 8 bytes
//		float n1 = 1.5f; // 4 bytes
//		short n2 = 5; // 2 bytes
//		long n3 = 10; // 8 bytes
//		boolean isHot = true; // 1 byte
//		byte n4 = 10; // 1 byte
//		char c1 = '\'';// escape character // 2 bytes
//		String name = "Joe"; // 8 bytes
		int occurrences = calculateOccurrences(numbers, target);
		System.out.println("The occurrences: " + occurrences);
	}
	
	public static int calculateOccurrences(String[] names, String name) {
		int count = 0;
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(name)) {
				count++;
			}
		}
		return count;
	}
	
	
	
	public static int calculateOccurrences(int[] numbers, int value) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == value) {
				count++;
			}
		}
		return count;
	}

}
