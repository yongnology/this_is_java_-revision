package sec10.exam03;

public class Car {
	// �ν��Ͻ� �ʵ� ����
	int speed;
	
	// �ν��Ͻ� �޼ҵ� ����
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		// ��ü ����
		Car myCar = new Car();
		// �ν��Ͻ� ��� ���
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		// ���� �޼ҵ� ȣ��
		simulate();
		
		// ��ü ����
		Car myCar = new Car();
		// �ν��Ͻ� ��� ���
		myCar.speed = 60;
		myCar.run();
	}
}

// ���� ���
/*
200���� �޸��ϴ�.
60���� �޸��ϴ�.
*/
