package sec04.exam02;

public class SupersoniceAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.takeoff();
	}
}
// 실행 결과
/*
이륙합니다.
일반 비행합니다.
초음속 비행합니다.
일반 비행합니다.
이륙합니다.
*/
