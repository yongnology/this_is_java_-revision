package sec02.exam01;

public class AExample {
	public static void main(String[] args) {
		// 객체 생성
		A a = new A();
		
		// B 객체 생성
		A.B b = a.new B();
		b.methodB();
	}
}

// A객체를 먼저 생성한 다음 B 객체를 생성해야 한다.

// 실행 결과
/*
methodB() 실행
*/
