package chapter08.sec05;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		System.out.println("------------가");
		rc.setMute(true);
		System.out.println("------------나");
		rc.setMute(false);
		
		System.out.println("■■■■■■■■■■■■■구분■■■■■■■■■■■■■");
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(8);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
	}
}

// 실행 결과
/*
TV를 켭니다
현재 TV 볼륨 : 5
------------가
무음 처리합니다
현재 TV 볼륨 : 0
------------나
무음 해제합니다
■■■■■■■■■■■■■구분■■■■■■■■■■■■■
Audio를 켭니다.
현재 Audio 볼륨 : 8
무음처리합니다.
현재 Audio 볼륨 : 0
무음 해제합니다
현재 Audio 볼륨 : 8
*/
