package sec10.exam01;
// �߻� Ŭ���� ����
public abstract class Phone {
	// �ʵ� ����
	String owner;
	
	// ������ ����
	Phone(String owner) {
		this.owner = owner;
	}
	
	// �޼ҵ� ����
	void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	
	void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
}
