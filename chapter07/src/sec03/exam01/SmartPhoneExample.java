package sec03.exam01;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// SmartPhone ��ü ����
		SmartPhone myPhone = new SmartPhone("������", "����");
		
		// Phone ���κ��� ��� ���� �ʵ� �б�
		System.out.println("�� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);
	}
}

// ���� ���
/*
Phone() ������ ����
SmartPhone(String model, String color) ������ �����
�� : ������
���� : ����
*/
