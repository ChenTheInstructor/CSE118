package p1_student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.getName() + ": " + s1.getGpa());
		s1.setName("Maria");
		s1.setGpa(3.5);
		s1.curveGpa(0.2);
		String n1 = s1.getName();
		double g1 = s1.getGpa();
		
		System.out.println("The name is: " + n1);
		System.out.println("The GPA is: " + g1);
//		s1.name = "Jose";
//		s1.gpa = 3.5;
		
		System.out.println("-------------------");
		Student s2 = new Student();
		System.out.println(s2.getName() + ": " + s2.getGpa());
		s2.setName("Jeremy");
		s2.setGpa(3.0);
		s2.curveGpa(0.2);
		System.out.println(s2.getName() + ": " + s2.getGpa());
		
		System.out.println("-----------------------");
		Student s3 = new Student();
		System.out.println(s3.getName() + ": " + s3.getGpa());
		
		System.out.println("---------------------------");
		Student s4 = new Student("Alan", 2.0);
		System.out.println(s4.getName() + ": " + s4.getGpa());
	}

}
