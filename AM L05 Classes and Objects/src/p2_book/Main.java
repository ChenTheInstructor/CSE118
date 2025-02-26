package p2_book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1.getTitle() + ": " + b1.getPrice());
		System.out.println("--------------------");
		Book b2 = new Book("Java", 10.0);
		System.out.println(b2.getTitle() + ": " + b2.getPrice());
		b2.discount(0.1);
		System.out.println(b2.getTitle() + ": " + b2.getPrice());
	}

}
