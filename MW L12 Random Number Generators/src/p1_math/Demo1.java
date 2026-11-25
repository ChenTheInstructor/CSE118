package p1_math;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String[] arr = new String[10000];
		
		for (int j = 0; j < 10000; j++) {
			String str = "";
			for (int i = 0; i < 10; i++) {
				str += (char) ((int) (Math.random() * (122 - 97 + 1)) + 97);

			}
			arr[j] = str.toUpperCase();
		}
		// 97 -- 122
//		System.out.println(Arrays.toString(arr));
		for(String s : arr) {
			System.out.println(s);
		}
	}

}
