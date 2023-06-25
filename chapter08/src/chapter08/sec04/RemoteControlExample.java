package chapter08.sec04;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		System.out.println();
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}
}

// 실행 결과
/*
TV를 켭니다
현재 TV 볼륨 : 5
TV를 끕니다.

Audio를 켭니다.
현재 Audio 볼륨 : 10
Audio를 끕니다.
*/
