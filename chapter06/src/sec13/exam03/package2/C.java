package sec13.exam03.package2;

import sec13.exam03.package1.*;

public class C {
	public C() {
		// ��ü ����
		A a = new A();
		
		// �ʵ尪 ����
		a.field1 = 1;	// O
//		a.field2 = 1;	// X	// default �ʵ� ���� �Ұ�(������ ����)
//		a.field3 = 1;	// X	// private �ʵ� ���� �Ұ�(������ ����)
		
		// �޼ҵ� ȣ��
		a.method1();	// O
//		a.method2();	// X
//		a.method3();	// X
	}
}
