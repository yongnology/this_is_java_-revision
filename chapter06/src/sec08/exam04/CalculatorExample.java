package sec08.exam04;
// �޼ҵ� �����ε�
public class CalculatorExample {
	public static void main(String[] args) {
		
		// ��ü ����
		Calculator cal = new Calculator();
		
		// ���簢���� ����
		double result1 = cal.areaRectangle(10);
		System.out.println("���簢�� ���� : " + result1);
		
		// ���簢���� ����
		double result2 = cal.areaRectangle(10, 20);
		System.out.println("���簢�� ���� : " + result2);
	}
}

// ���� ���
/*
���簢�� ���� : 100.0
���簢�� ���� : 200.0
*/
