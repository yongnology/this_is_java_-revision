package sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자수 : " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}

// 실행 결과
/*
[프로그램 시작]

Exception in thread "main" 문자수 : 10
java.lang.NullPointerException
	at sec02.exam01.ExceptionHandlingExample1.printLength(ExceptionHandlingExample1.java:5)
	at sec02.exam01.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:12)
*/
