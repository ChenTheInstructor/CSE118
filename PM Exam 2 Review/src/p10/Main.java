package p10;

public class Main {

	public static void main(String[] args) {
		Plant p1 = new Plant("Oak", 100);
		p1.updateHeight();
		p1.updateHeight();
		p1.updateHeight();
		System.out.println(p1.getHeightCm());
		
	}

}
