package sec09;
// this 키워드
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		
	}
}

// 실행 결과
/*
포르쉐가 달립니다. (시속 : 100km/h)
벤츠가 달립니다. (시속 : 100km/h)
*/
