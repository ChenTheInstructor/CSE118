package p1_fan;

public class Main {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		System.out.println(fan1);
		
		Fan fan2 = new Fan("Red", 200);
		System.out.println(fan2);
		
		fan1.setColor("Black");
		fan1.setSpeed(100);
		
		System.out.println(fan1);
		
		System.out.println(fan2.getColor());
	}

}
