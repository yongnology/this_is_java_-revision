package sec02;

public class SmartPhoneExample {
	
	public static void main(String[] args) {
		// SmartPhone ��ü ����
		SmartPhone myPhone = new SmartPhone("������", "����");
		
		// Phone ���κ��� ��ӹ��� �ʵ� �б�
		System.out.println("�� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);
		
		// smartPhone�� �ʵ� �б�
		System.out.println("�������� ���� : " + myPhone.wifi);
		
		// Phone���κ��� ��ӹ��� �޼ҵ� ȣ��
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�ȳ��ϼ��� ���� �̿�� �Դϴ�.");
		myPhone.sendVoice("��~�� �ݰ����ϴ�.");
		myPhone.handUp();
		
		// SmartPhone �޼ҵ� ȣ��
		myPhone.setWifi(true);
		myPhone.internet();
	}
}

// ���� ���
/*
�� : ������
���� : ����
�������� ���� : false
���� �︳�ϴ�.
�ڱ� : ��������
���� : �ȳ��ϼ��� ���� �̿�� �Դϴ�.
�ڱ� : ��~�� �ݰ����ϴ�.
��ȭ�� ������ϴ�.
�������� ���¸� �����߽��ϴ�.
���ͳݿ� �����մϴ�.
*/
