package p2_coding_questions;

public class Main {

	public static void main(String[] args) {
//		Main main1 = new Main();
//		Main main2 = new Main();
//		
//		System.out.println(Dog.getBreed());
//		Dog.setBreed("Poodle");
//		System.out.println(Dog.getBreed());
		Dog dog1 = new Dog();
		System.out.println(dog1);
		
		Dog dog2 = new Dog("Graffy", 20);
		System.out.println(dog2);
		
		Dog dog3 = new Dog(30, "Max213");
		System.out.println(dog3);
		
		dog3.setName("Max123");
		dog3.setWeight(100);
		System.out.println(dog3);
		
		System.out.println(dog3.getName());
		System.out.println(dog1.getName());
		
		dog3.feed(15);
	
		System.out.println(dog3.getWeight());
	}
	

}
