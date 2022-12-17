package p2;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 5, 7, 9, 20};
		
		int[][] a = {
				{10, 1}, 
				{20, 2}, 
				{30, 3}, 
				{40, 4}
				}; // an array of 4 arrays
		
		
		showArray(a);
	}

	public static void showArray(int[][] arr) {
		for(int i  =0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
