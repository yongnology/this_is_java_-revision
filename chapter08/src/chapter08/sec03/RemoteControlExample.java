package chapter08.sec03;
// 상수 필드
public class RemoteControlExample {
	public static void main(String[] args) {
		System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저 볼륨 : " + RemoteControl.MIN_VOLUME);
		
	}
}

// 실행 결과
/*
리모콘 최대 볼륨 : 10
리모콘 최저 볼륨 : 0
*/

// 상수는 구현 객체와 관련 없는 인터페이스 소속 멤버이므로 인터페이스에 바로 접근해 상수값을 읽을 수 있다.