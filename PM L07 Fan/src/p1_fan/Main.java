package p1_fan;

public class Main {

	public static void main(String[] args) {
		
		Fan f1 = new Fan();
		Fan f2 = new Fan(1000, "Yellow");
		Fan f3 = new Fan("Blue", 500);
		
		
		System.out.println(Fan.getStyle());
		
		
		Fan fan1 = new Fan();
		System.out.println(fan1);
		System.out.println("\nChange color and speed ..... ");
//		fan1.setColor("RED");
//		fan1.setSpeed(1000);
		fan1.color = "RED";
		fan1.speed = 10000;
		System.out.println(fan1);
//		System.out.println("Color: " + fan1.getColor());
//		System.out.println("Speed: " + fan1.getSpeed());
		System.out.println("Color: " + fan1.color);
		System.out.println("Speed: " + fan1.speed);
//		
//		Fan fan2 = new Fan("Red", 200);
//		System.out.println(fan2);
//		
//		fan1.setColor("Black");
//		fan1.setSpeed(100);
//		
//		System.out.println(fan1);
//		
//		System.out.println(fan2.getColor());
	}

}
