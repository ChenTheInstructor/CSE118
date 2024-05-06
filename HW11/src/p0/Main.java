package p0;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D", "E"};
		String[] truncatedArr = Arrays.copyOfRange(arr, 2, 4);
//		for(String str : truncatedArr) {
//			System.out.println(str);
//		}
		System.out.println(Arrays.toString(arr));
	}

}
