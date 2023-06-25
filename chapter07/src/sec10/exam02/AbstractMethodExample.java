package sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("--����--");
		
		// �Ű������� ������
		animalSound(new Cat());
		animalSound(new Dog());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

// ���� ���
/*
�۸�
�߿�
--����--
�߿�
�۸�
*/
