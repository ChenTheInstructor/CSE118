package p1_student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Joey");
		s1.setGpa(3.0);
		s1.curveGpa(0.5);
		System.out.println(s1.getName());
		System.out.println(s1.getGpa());
		
		System.out.println();
		
		Student s2 = new Student();
		s2.setName("Susie");
		s2.setGpa(3.5);
		s2.curveGpa(0.5);
		System.out.println(s2.getName());
		System.out.println(s2.getGpa());
		
		System.out.println();
		
	}

}
