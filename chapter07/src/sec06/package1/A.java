package sec06.package1;

public class A {
	// �ʵ� ����
	protected String field;
	
	// ������ ����
	protected A() {
		
	}
	
	// �޼ҵ� ����
	protected void method() {
		System.out.println("public class A�� method");
		System.out.println("field = " + field);
	}
}
