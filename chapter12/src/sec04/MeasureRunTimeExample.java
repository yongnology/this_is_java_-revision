package sec04;
// 진행 시간 읽기
public class MeasureRunTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		System.out.println("시작 : " + time1);
		int sum = 0;
		for(int i=1; i<= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		System.out.println("종료 : " + time2);
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 "+ (time2-time1) + "나노초가 소요되었습니다.");
	}
}

// 실행 결과
/*
1~1000000까지의 합 : 1784293664
계산에 1497900나노초가 소요되었습니다.
*/
