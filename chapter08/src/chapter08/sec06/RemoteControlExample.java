package chapter08.sec06;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(6);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();
	}
}

// 실행 결과
/*
TV를 켭니다
현재 TV 볼륨 : 6

Audio를 켭니다.
현재 Audio 볼륨 : 3
무음처리합니다.
현재 Audio 볼륨 : 0
무음 해제합니다
현재 Audio 볼륨 : 3

리모콘 건전지를 교환합니다.
*/
