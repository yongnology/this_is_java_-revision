package sec07.exam04;

public class Car {
	// �ʵ� ����
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������ ���� 1
	Car() {}
	
	// ������ ���� 2
	Car(String model) {
		this.model = model;
	}
	
	// ������ ���� 3
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// ������ ���� 4
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
