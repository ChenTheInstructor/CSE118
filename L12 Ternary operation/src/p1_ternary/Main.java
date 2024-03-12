package p1_ternary;

public class Main {

	public static void main(String[] args) {
//		int temp = 30;
//		String feelings = (temp >= 90) ? "HOT" : (temp >= 80) ? "WARM" : (temp <= 32) ? "FREEZING" : "NOT BAD";
//		System.out.println(feelings);"

		int x = 100;
		int y = 20;
		String max = (x >= y) ? String.valueOf(x) : String.valueOf(y);
		System.out.println("The larger value is: " + max);
		
		System.out.println(Double.parseDouble("1000")/ 33);
	}

}
