package sec03.exam01;

public class SmartPhone extends Phone {
	// �ڽ� ������ ����
	public SmartPhone(String model, String color) {
		super();		// ���� ����.(������ �� �ڵ� �߰���)
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) ������ �����");
	}
}
