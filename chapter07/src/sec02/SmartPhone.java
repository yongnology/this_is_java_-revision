package sec02;

public class SmartPhone extends Phone {
	// �ʵ� ����
	public boolean wifi;
	
	// ������ ����
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// �޼ҵ� ����
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� �����մϴ�.");
	}
}
