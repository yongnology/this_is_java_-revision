package sec08.exam01;

public class Calculator {
	// ���ϰ��� ���� �޼ҵ� ����
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
	// ȣ�� �� �� ���� ���� ���޹ް�
	// ȣ���� ������ ����� int �� �����ϴ� �޼ҵ� ����
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
}
