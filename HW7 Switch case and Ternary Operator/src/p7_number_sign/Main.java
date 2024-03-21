package p7_number_sign;

public class Main {

	public static void main(String[] args) {
		int num = 0;
		String  sign = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
		System.out.println("The sign is: " + sign);
	}

}
