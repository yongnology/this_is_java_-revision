package sec05.exam02;

public class AExample {
	public static void main(String[] args) {
		// A 객체 생성
		A a = new A();
		
		// A 메소드 호출
		a.useB();
	}
}

// 실행 결과
/*
B-field
B-method
A-field
A-mehotd
*/
