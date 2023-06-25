package chapter08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		// rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		
		// rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
}

// 실행 결과
/*
TV를 켭니다.
Audio 를 켭니다.
*/
