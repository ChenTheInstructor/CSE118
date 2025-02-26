package p1_fan;

public class Fan {
	private String color;
	private int speed;
	
	public Fan() {
		super();
		color = "White";
		speed = 0;
	}

	public Fan(String color, int speed) {
		super();
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

	@Override
	public String toString() {
		return "Fan [color=" + color + ", speed=" + speed + "]";
	}
	
	

}
