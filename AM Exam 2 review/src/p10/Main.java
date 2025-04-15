package p10;

public class Main {

	public static void main(String[] args) {
		Plant p1 = new Plant("Oak", 50);
		System.out.println(String.format("%.1f", p1.getHeightCM()));
		p1.update();
		System.out.println(String.format("%.1f", p1.getHeightCM()));
		p1.update();
		System.out.println(String.format("%.1f", p1.getHeightCM()));
	}

}
