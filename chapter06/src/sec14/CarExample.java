package sec14;

public class CarExample {
	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}
}

// ���� ���
/*
����ӵ� : 0
����ӵ� : 60
���� �ӵ� : 0
*/
