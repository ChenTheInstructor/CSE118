package p1_dog;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		System.out.println(dog1);
		
		Dog dog2 = new Dog("Max2", 10);
		System.out.println(dog2);
		Dog.setBreed("Poodle");
		
		System.out.println("\nChange breed to poodle: ");
		Dog dog3 = new Dog("Max3");
		
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		
	}

}
