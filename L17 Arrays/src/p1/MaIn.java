package p1;

public class MaIn {

	public static void main(String[] args) {
//		double[] numbers = new double[2000];
//		System.out.println(numbers[0]);
//		System.out.println(numbers[numbers.length - 1]);
//		
//		numbers[0] = 10.0;
//		numbers[numbers.length - 1] = 10;
//		System.out.println(numbers[0]);
//		System.out.println(numbers[numbers.length - 1]);
		
//		String[] names = new String[5];
//		names[0] = "Alan";
//		names[1] = "Bill";
//		names[2] = "Cathy";
//		names[3] = "Dave";
//		names[4] = "Ellen";
		
//		String[] names = {"Alan", "Bill", "Cathy", "Dave", "Ellen"};
//		int[] myArr = new int[10];
//		myArr[0] = 100;
//		myArr[myArr.length - 1] = 100;
////		int[] myArr2 = fillArray(myArr);
//		myArr[0] = 10000;
//		showIntegerArray(myArr);
////		showIntegerArray(myArr2);
		
		int[] myArr = new int[10];
		int[] myArr2 = myArr;
		fillArray(myArr);
		showIntegerArray(myArr);
		showIntegerArray(myArr2);
	}
	
	public static void fillArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10;
		}
	}
	
	public static void showIntegerArray(int[] arr) {
		// display every element in the array named arr
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
