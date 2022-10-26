package p4_floating_number_precisions;

public class Main {

	public static void main(String[] args) {
		double n = 1.0 - 0.1 - 0.1 - 0.1 - 0.1;
		System.out.println(n);// round-off errors
		double e = 0.0000000001;// desired precision
		System.out.println(Math.abs(n - 0.6) < e);
		
		System.out.println(Math.abs(10000));
	}

}
