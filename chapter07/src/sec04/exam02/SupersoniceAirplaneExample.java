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
// ���� ���
/*
�̷��մϴ�.
�Ϲ� �����մϴ�.
������ �����մϴ�.
�Ϲ� �����մϴ�.
�̷��մϴ�.
*/
