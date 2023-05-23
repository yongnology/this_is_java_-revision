package sec05;
// 문자열 대체
public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. [자바]";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

// 실행 결과
/*
자바 문자열은 불변입니다. [자바]
JAVA 문자열은 불변입니다. [JAVA]
*/
