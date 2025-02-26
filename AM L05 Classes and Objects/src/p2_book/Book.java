package p2_book;

public class Book {
	private String title;
	private double price;
	
	public Book() { // no-arg constructor
		title = null;
		price = 0.0;
	}
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void discount(double discountAmount) {
		price = price - price * discountAmount;
	}
}
