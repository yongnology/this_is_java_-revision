package chapter08.sec07;

public class ServiceExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();
		
		// 디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println("---1---");
		service.defaultMethod2();
		System.out.println("---2---");
		
		// 정적 메소드 호출
		Service.staticMethod1();
		System.out.println("--3--");
		Service.staticMethod2();
		System.out.println("--4--");
	}
}
// 실행 결과
/*
defaultMethod1 종속 코드
defaultMethod 중복 코드A
defaultMethod 중복 코드B
---1---
defaultMethod2 종속 코드
defaultMethod 중복 코드A
defaultMethod 중복 코드B
---2---
staticMethod1 종속 코드
staticMethod 중복 코드C
staticMethod 중복 코드D
--3--
staticMethod2 종속 코드
staticMethod 중복 코드C
staticMethod 중복 코드D
--4--
*/
