package p3_print_random_even_numbers;

public class Main2 {

	public static void main(String[] args) {

//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(i + "x" + j + "=" + i * j + "\t");
//			}
//			System.out.println();
//		}
		
		int total = 0;
		for(int i = 1; i < 10; i++) {
			total = total + i;
		}
		System.out.println("The total is: " + total);
	}

}
