package sec09;
// this Ű����
public class Car {
	// �ʵ� ����
	String model;
	int speed;
	
	// ������ ����
	Car(String model) {
		this.model = model;
	}
	
	// �޼ҵ� ����
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "�� �޸��ϴ�. (�ü� : " + this.speed + "km/h)");
	}
}
