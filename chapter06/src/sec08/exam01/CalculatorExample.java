package sec08.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		// Calculator ��ü ����
		Calculator cal = new Calculator();
		
		// ���ϰ��� ���� poerOn() �޼ҵ� ȣ��
		cal.powerOn();
		
		// plus �޼ҵ� ȣ��(5�� 6�� �Ű������� ����)
		int result1 = cal.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		double result2 = cal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		// ���ϰ��� ���� �޼ҵ� ȣ��
		cal.powerOff();
	}
}

// ���� ���
/*
������ �մϴ�.
result1 : 11
result2 : 2.5
������ ���ϴ�
*/
