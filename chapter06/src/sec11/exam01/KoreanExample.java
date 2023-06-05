package sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		// 객체 생성 시 주민드록번호와 이름 전달
		Korean k1 = new Korean("123456-1234567", "이자바");
		
		// 필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		System.out.println();
		
		// final 필드는 값을 변경할 수 없음
		// k1.nation = "usa";
		
		// 비 final 필드는 값 변경 가능
		k1.name = "홍자바";
		System.out.println(k1.name);
	}
}

// 실행 결과
/*
대한민국
123456-1234567
이자바

홍자바
*/
