package p1;

public class Main {

	public static void main(String[] args) {
		int[] numbers = createAndFill();
		printReverse(numbers);
	}
	
	private static int[] createAndFill() {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		return nums;
	}

	public static void printReverse(int[] arr) { 
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
