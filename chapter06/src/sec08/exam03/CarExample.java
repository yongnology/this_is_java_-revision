package sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		// car 객체 생성
		Car myCar = new Car();
		
		// 리턴값이 없는 setGas() 메소드 호출
		myCar.setGas(6);
		
		// isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요");
	}
}

// 실행 결과
/*
gas가 있습니다.
출발합니다.
달립니다. (gas 잔량 : 6L)
달립니다. (gas 잔량 : 5L)
달립니다. (gas 잔량 : 4L)
달립니다. (gas 잔량 : 3L)
달립니다. (gas 잔량 : 2L)
달립니다. (gas 잔량 : 1L)
멈춥니다. (gas 잔량 : 0L)
gas를 주입하세요
*/
