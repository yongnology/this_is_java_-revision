package sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println(data + " 문자수 : " + result);
		} catch(NullPointerException e) {
			// 예외 정보를 얻는 3가지
			System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//e.printStackTrace();
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]\n");
	}
}

// 실행 결과
/*
[프로그램 시작]
ThisIsJava 문자수 : 10
[마무리 실행]

null
[마무리 실행]

[프로그램 종료]

*/
