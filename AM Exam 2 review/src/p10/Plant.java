package p10;

public class Plant {
	private String name;
	private double heightCM;

	public Plant(String name, double heightCM) {
		super();
		this.name = name;
		this.heightCM = heightCM;
	}

	public void update() {
		heightCM = heightCM * 1.1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeightCM() {
		return heightCM;
	}

	public void setHeightCM(double heightCM) {
		this.heightCM = heightCM;
	}

	@Override
	public String toString() {
		return "Plant [name=" + name + ", heightCM=" + heightCM + "]";
	}

}
