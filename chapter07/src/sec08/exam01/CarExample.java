package sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		// Car ��ü ����
		Car myCar = new Car();
		
		// Tire ��ü ����
		myCar.tire = new Tire();
		myCar.run();
		
		// HankookTire ��ü ����
		myCar.tire = new HankookTire();
		myCar.run();
		
		// KumhoTire ��ü ����
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}

// ���� ���
/*
ȸ���մϴ�.
��ȣ Ÿ�̾ ȸ���Ѵ�.
�ѱ� Ÿ�̾ ȸ���Ѵ�.
*/
