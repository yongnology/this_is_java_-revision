package sec07.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("�ڰ���");
		System.out.println("Car car1 = new Car(\"�ڰ���\");");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println();
		
		Car car2 = new Car("�ڰ���", "����");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		Car car3 = new Car("�ý�", "����", 200);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
	}
}

// ���� ���
/*
Car car1 = new Car("�ڰ���");
car1.company : �����ڵ���
car1.model : �ڰ���

car2.company : �����ڵ���
car2.model : �ڰ���
car2.color : ����

car3.company : �����ڵ���
car3.model : �ý�
car3.color : ����
car3.maxSpeed : 200
*/
