package sec13.exam03.package1;

public class B {
	public void method() {
		// ��ü ����
		A a = new A();
		
		// �ʵ尪 ����
		a.field1 = 1;	// O
		a.field2 = 1;	// O
//		a.field3 = 1;	// X	// private �ʵ� ���� �Ұ�(������ ����)
		
		// �޼ҵ� ȣ��
		a.method1();	// O
		a.method2();	// O
//		a.method3();	// X	// private �޼ҵ� ���� �Ұ�(������ ����)
	}
}
