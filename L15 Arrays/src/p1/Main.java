package p1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = fillArray(4, 5);
		showArray(a);
//		int[] b = deepCopyOf(a, 2);
//		int[] b = Arrays.copyOf(a, 3);
		Arrays.sort(a);
		showArray(a);
		
//		showArray(b);
//		showArray(a);
//		System.out.println(getMaximum(a));
//		System.out.println(getMinimum(a));
//		System.out.println(getSum(a));
//		System.out.println(getAverage(a));
//		int[] b = deepCopyOf(a);
//		showArray(a);
//		showArray(b);
		
//		a[0] = 1000;
//		showArray(a);
//		showArray(b);
	}
	
//	public static int[] shallowCopyOf(int[] arr) { // copy the address of original array
//		return arr;
//	}
	
	public static int[] deepCopyOf(int[] arr, int startIndex) {
		int[] newArr = new int[arr.length - startIndex];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[startIndex+i];
		}
		return newArr;
	}
	
	public static int[] deepCopyOf(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
 
	public static double getAverage(int[] arr) {
		return 1.0 * getSum(arr) /arr.length;
	}

	public static int getSum(int[] arr) {
		int total = 0;
		for (int n : arr) {
			total += n;
		}
		return total;
	}

	public static int getMinimum(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for (int n : arr) {
			if (n < smallest) {
				smallest = n;
			}
		}
		return smallest;
	}

	public static int getMaximum(int[] arr) {
		int largest = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				largest = arr[i];
//			}
//		}

		for (int n : arr) {
			if (n > largest) {
				largest = n;
			}
		}
		return largest;
	}

	public static int[] fillArray(int arraySize, int maxSize) {
		int[] arr = new int[arraySize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (maxSize + 1));
		}
		return arr;
	}

	public static void showArray(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
