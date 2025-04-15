package p10;

public class Plant {
	private String name;
	private double heightCm;
	public Plant(String name, double heightCm) {
		super();
		this.name = name;
		this.heightCm = heightCm;
	}
	public Plant(String name) {
		super();
		this.name = name;
	}
	
	public void updateHeight() {
		heightCm = heightCm * 1.1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeightCm() {
		return heightCm;
	}
	public void setHeightCm(double heightCm) {
		this.heightCm = heightCm;
	}
	@Override
	public String toString() {
		return "Plant [name=" + name + ", heightCm=" + heightCm + "]";
	}
	
	
}
