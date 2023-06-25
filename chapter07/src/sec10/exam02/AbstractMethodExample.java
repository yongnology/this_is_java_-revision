package sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("--备盒--");
		
		// 概俺函荐狼 促屈己
		animalSound(new Cat());
		animalSound(new Dog());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

// 角青 搬苞
/*
港港
具克
--备盒--
具克
港港
*/
