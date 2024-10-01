import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 2.1);
		Student s2 = new Student("B", 3.1);
		Student s3 = new Student("C", 1.1);
		Student s4 = new Student("D", 0.1);
		
		GenericBag<Student> theBag = new GenericBag<>(Student.class, 4);
		theBag.add(s1);
		theBag.add(s2);
		theBag.add(s3);
		theBag.add(s4);
		
		theBag.display();
		
//		Student[] foundArr = theBag.search(Student.class, s -> s.equals(s1));
//		System.out.println(Arrays.toString(foundArr));
		
		Student[] removedArr = theBag.remove(Student.class, s -> s.getGpa() == 3.1);
		System.out.println(Arrays.toString(removedArr));
		theBag.display();
		
	}

}
