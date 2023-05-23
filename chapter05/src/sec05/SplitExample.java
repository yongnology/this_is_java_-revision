package sec05;
// 문자열 분리
public class SplitExample {
	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		// 문자열 분리
		String[] tokens = board.split(",");

		// for 문을 이용한 읽기
		for(int i=0; i< tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
	}
}

// 실행 결과
/*
1
자바 학습
참조 타입 String을 학습합니다.
홍길동
*/
