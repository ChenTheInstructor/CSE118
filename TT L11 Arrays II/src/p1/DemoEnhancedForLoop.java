package p1;

public class DemoEnhancedForLoop {

	public static void main(String[] args) {
		int[] arr = {3, 6, 1, 4, 2, 0};
		
		// use a traditional for-loop
		System.out.println("Output from the traditional for-loop: ");
		for(int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\nOutput from the Enhanced for-loop: ");
		// Enhanced for-loop
		for(int element : arr) {
			System.out.println(element * 2);
		}
	}

}
