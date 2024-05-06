package p7_linear_search;

import java.util.Arrays;

public class Main7 {

	public static void main(String[] args) {
//		int[] a = {1, 4, 6, 3, 2, 9};
//		int target = 9;
//		System.out.println(linearSearch(a, target));
		
		String[] names = {"Bill", "Bill", "Alan", "Bill", 
				"Bill", "Zack", "Liz", "Alan", "Muhammud", "Jose"};
		String targetName = "Alan";
		int[] matches = linearSearchAll(names, targetName);
		for(int index : matches) {
			System.out.print(index + " ");
		}
	
	}
	
	public static int[] linearSearchAll(String[] names, String target) {
		int[] matches = new int[names.length];
		int matchCount = 0;
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(target)) {
				matches[matchCount] = i;
				matchCount++;
			}
		}
//		return matches;
		return Arrays.copyOf(matches, matchCount);
		
	}
	
	public static int linearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linearSearch(String[] arr, String target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

}
