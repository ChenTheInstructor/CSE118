package p1_student;

public class Main {

	public static void main(String[] args) {
		String s = new String("Hi");
		
		//first student object
		Student s1 = new Student();
		s1.setName("Maria");
		s1.setGpa(3.5);
		System.out.println(s1.getName());
		System.out.println(s1.getGpa());
		
		
		// second student object
		Student s2 = new Student();
		s2.setName("Joey");
		s2.setGpa(3.4);
		System.out.println(s2.getName());
		System.out.println(s2.getGpa());
		
	}

}
