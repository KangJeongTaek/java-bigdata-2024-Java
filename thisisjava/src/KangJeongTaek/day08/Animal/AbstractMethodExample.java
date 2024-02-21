package KangJeongTaek.day08.Animal;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat= new Cat();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}
	public static void animalSound(Animal 動物) {
		動物.sound();
	}
}
