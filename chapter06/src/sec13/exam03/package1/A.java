package sec13.exam03.package1;

public class A {
	// public ���� ������ ���� �ʵ� ����
	public int field1;
	
	// default ���� ������ ���� �ʵ� ����
	int field2;
	
	// private ���� ������ ���� �ʵ� ����
	private int field3;
	
	// ������ ����
	public A() {
		field1 = 1;	// O
		field2 = 2;	// O
		field3 = 1;	// O
		
		method1();	// O
		method2();	// O
		method3();	// O
	}
	
	// public ���� ������ ���� �޼ҵ� ����
	public void method1() {
		
	}
	
	// default ���� ������ ���� �޼ҵ� ����
	void method2() {
		
	}
	
	// private ���� ������ ���� �޼ҵ� ����
	private void method3() {
		
	}
}
