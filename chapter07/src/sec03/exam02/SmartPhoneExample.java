package sec03.exam02;

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
Phone(String model, String color) ������ ����
SmartPhoen(String model, String color) ������ �����
�� : ������
���� : ����
*/
