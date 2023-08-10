package sec05;

public class ThrowExample1 {
	public static void main(String[] args) {
		
		// 호출한 곳에서 예외 처리
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("예외 처리 " + e.getMessage());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}

// 실행 결과
/*
예외 처리 java.lang.String2
*/
