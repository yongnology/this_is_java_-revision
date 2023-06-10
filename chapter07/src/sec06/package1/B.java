package sec06.package1;	// 같은 페키지

public class B {
	// 메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
