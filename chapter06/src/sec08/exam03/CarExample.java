package sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		// car ��ü ����
		Car myCar = new Car();
		
		// ���ϰ��� ���� setGas() �޼ҵ� ȣ��
		myCar.setGas(6);
		
		// isLeftGas() �޼ҵ带 ȣ���ؼ� ���� ���ϰ��� true�� ��� if ��� ����
		if(myCar.isLeftGas()) {
			System.out.println("����մϴ�.");
			
			myCar.run();
		}
		
		System.out.println("gas�� �����ϼ���");
	}
}

// ���� ���
/*
gas�� �ֽ��ϴ�.
����մϴ�.
�޸��ϴ�. (gas �ܷ� : 6L)
�޸��ϴ�. (gas �ܷ� : 5L)
�޸��ϴ�. (gas �ܷ� : 4L)
�޸��ϴ�. (gas �ܷ� : 3L)
�޸��ϴ�. (gas �ܷ� : 2L)
�޸��ϴ�. (gas �ܷ� : 1L)
����ϴ�. (gas �ܷ� : 0L)
gas�� �����ϼ���
*/
