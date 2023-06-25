package chapter08.sec08;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		// RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		
		// RemoteControl 인터페이스 선언된 추상 메소드만 호출 가능
		rc.turnOn();
		rc.turnOff();
		
		// Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = new SmartTelevision();
		searchable.search("https://www.naver.com");
	}
}

// 실행 결과
/*
TV를 켭니다.
TV를 끕니다
https://www.naver.com을 검색합니다.
*/
