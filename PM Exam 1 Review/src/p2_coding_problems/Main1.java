package p2_coding_problems;

public class Main1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printDetails();
		Person p2 = new Person();
		p2.printDetails();
		
		Person p3 = new Person("Suzie", 21);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3.toString());
	}
	

}
