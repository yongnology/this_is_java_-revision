package sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		// Driver ��ü ����
		Driver driver = new Driver();
		
		// �Ű������� Bus ��ü�� �����ϰ� Driver() �޼ҵ� ȣ��
		Bus bus = new Bus();
		driver.drive(bus);	// driver.drive(new Bus() ); �� ����
		
		// �Ű������� Taxi ��ü�� �����ϰ� Driver() �޼ҵ� ȣ��
		Taxi taxi = new Taxi();
		driver.drive(taxi);	// driver.drive(new Taxi() ); �� ����
		
	}
}

// ���� ���
/*
������ �޸��ϴ�.
�ýð� �޸��ϴ�.
*/
