package sec06.package2;

import sec06.package1.A;

public class D extends A {
	// ������ ����
	public D() {
		// A() ������ ȣ��
		super();
	}
	
	// �޼ҵ� ����
	public void method1() {
		// A �ʵ尪 ����
		this.field = "value";	// o
		// A �޼ҵ� ȣ��
		this.method();
	}
	
	// �޼ҵ� ����
	public void method2() {
//		A a = new A();		// x
//		a.field = "value";	// x
//		a.method();			// x
	}
}
