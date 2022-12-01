package p2;

public class MainP2 {

	public static void main(String[] args) {
//		int[] numbers = new int[3];
//		
//		numbers[1] = 10;
//		numbers[0] = 20;
//		numbers[2] = 30;
////		numbers[3] = 100; // runtime exception
//		
//		for(int i : numbers) {
//			System.out.println(i);
//		}
		
		double[] gpas = new double[5];
		gpas[0] = 4.0;
		gpas[1] = 2;
		gpas[2] = 3.5;
		gpas[3] = 2.7;
		gpas[4]= 3.7;
		
//		for(double gpa : gpas) {
//			System.out.println(gpa);
//		}
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		String[] names = {"alan", "bill", "susie", "julie", "zack"};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(names[i] + ", " + numbers[i] + ", " + gpas[i]);
		}
	}

}
