package sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		// intArray[0] = 10;
		
		String str = null;
		// System.out.println(str.length());
	}
}

// 실행 결과
/*

Exception in thread "main" java.lang.NullPointerException
	at sec04.NullPointerExceptionExample.main(NullPointerExceptionExample.java:6)
-------------------------------------------------------------------------------------
Exception in thread "main" java.lang.NullPointerException
	at sec04.NullPointerExceptionExample.main(NullPointerExceptionExample.java:9)
*/
