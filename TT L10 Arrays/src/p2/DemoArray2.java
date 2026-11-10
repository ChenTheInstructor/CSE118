package p2;

import java.util.Arrays;

public class DemoArray2 {

	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0] = "Adam";
		arr[4] = "Renato";
		arr[0] = "Jose";
		arr[1] = "Bill";
		arr[2] = "Cathy";
		arr[3] = "Maria";
		System.out.println(Arrays.toString(arr));
		
		String max = arr[0];
		String min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i].compareTo(min) < 0) {
				min = arr[i];
			} 
			
			if(arr[i].compareTo(max) > 0) {
				max = arr[i];
			}
		}
		System.out.println("The max name: " + max);
		System.out.println("The min name: " + min);
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("Backwards: ");
//		for(int i = arr.length-1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
	}

}
