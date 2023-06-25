package chapter08.sec10.exam02;

public class CatingExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언과 구현 객체 타입
		Vehicle vehicle = new Bus();
		
		// 인터ㅔㅍ이스 통해서 호출
		vehicle.run();
		
		// vehicle.checkFare();	// x
		// 강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}

// 실행 결과
/*
버스가 달립니다.
버스가 달립니다.
승차요금을 체크합니다.
*/
