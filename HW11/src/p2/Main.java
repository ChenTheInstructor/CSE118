package p2;

public class Main {

	public static void main(String[] args) {
		int size = 5;
		int min = 10;
		int max = 20;
		int[] a = fillWithRandomIntegers(size, min, max);
		showArray(a);
		System.out.println("The largest is: " + findMax(a));
	}
	
	public static void showArray(int[] arr) {
		for(int n : arr) { // for-each loop or enhanced for loop
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	private static int[] fillWithRandomIntegers(int size, int min, int max) {
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random() * (max - min + 1)) + min;
		}
		return arr;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
