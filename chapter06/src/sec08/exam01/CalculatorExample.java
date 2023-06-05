package sec08.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator cal = new Calculator();
		
		// 리턴값이 없는 poerOn() 메소드 호출
		cal.powerOn();
		
		// plus 메소드 호출(5와 6을 매개값으로 제공)
		int result1 = cal.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		double result2 = cal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		// 리턴값이 없는 메소드 호출
		cal.powerOff();
	}
}

// 실행 결과
/*
전원을 켭니다.
result1 : 11
result2 : 2.5
전원을 끕니다
*/
