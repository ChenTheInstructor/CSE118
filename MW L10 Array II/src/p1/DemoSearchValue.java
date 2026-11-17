package p1;

public class DemoSearchValue {

	public static void main(String[] args) {
		int[] values = { 14, 8, 23, 5, 19 };
		int target = 23;
		boolean found = false;
		
		for(int i = 0; i < values.length; i++) {
			if(values[i] == target) {
				found = true;
				break;
			}
		}
		
		System.out.println(found ? "Found" : "Not found");
	}

}
