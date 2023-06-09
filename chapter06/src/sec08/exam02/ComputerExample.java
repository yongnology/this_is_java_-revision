package sec08.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		// Computer 객체 생성
		Computer myCom = new Computer();
		
		// sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
		// 합산 결과를 리턴받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result2);
		
		int[] values = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5, 6});
		System.out.println("result4 : " + result4);
	}
}

// 실행결과
/*
result1 : 6
result2 : 15
result3 : 15
result4 : 21
*/
