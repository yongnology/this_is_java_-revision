package sec08.exam04;
// 메소드 오버로딩
public class CalculatorExample {
	public static void main(String[] args) {
		
		// 객체 생성
		Calculator cal = new Calculator();
		
		// 정사각형의 넓이
		double result1 = cal.areaRectangle(10);
		System.out.println("정사각형 넓이 : " + result1);
		
		// 직사각형의 넓이
		double result2 = cal.areaRectangle(10, 20);
		System.out.println("직사각형 넓이 : " + result2);
	}
}

// 실행 결과
/*
정사각형 넓이 : 100.0
직사각형 넓이 : 200.0
*/
