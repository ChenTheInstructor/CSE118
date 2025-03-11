package p1_fan;

public class Fan {
	// instance fields
	String color;
	int speed;

	// static fields
	private static final String STYLE = "upright";

	// overloaded constructors
	public Fan() { // no-arg constructor
		color = "White";
		speed = 0;
	}

	public Fan(String color, int speed) { //
		this.color = color;
		this.speed = speed;
	}
	
	public Fan(int speed, String color) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public static String getStyle() {
		return STYLE;
	}
	

	@Override
	public String toString() {
		return "Fan [color=" + color + ", speed=" + speed + "]";
	}

}
