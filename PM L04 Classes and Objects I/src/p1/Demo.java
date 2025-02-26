package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Angel");
		s1.setGpa(3.5);
		System.out.println("The name is: " + s1.getName());
		System.out.println("The GPA is: " + s1.getGpa());
		s1.setGpa(4.0);
		System.out.println("The GPA is: " + s1.getGpa());
		
	}

}
