package sec03.exam02;

public class AExample {
	public static void main(String[] args) {
		// B 객체 생성 및 인스턴스 필드 및 메소드 사용
		A.B b = new A.B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(b.field2);
		A.B.method2();
	}
}

// 실행 결과
/*
B- 생성자 실행
1
B-method1 실행
2
B-method2 실행
*/
