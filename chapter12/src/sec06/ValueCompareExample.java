package sec06;
// 포장 값 비교
public class ValueCompareExample {
	public static void main(String[] args) {
		// -128~127 초과일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("Integer objN = 300");
		System.out.println("== : " + (obj1 == obj2));
		System.out.println("equals() : " + (obj1.equals(obj2)));
		System.out.println();
		
		// -128~127 범위값일 경우
		Integer obj3 = 30;
		Integer obj4 = 30;
		System.out.println("Integer objN = 30");
		System.out.println("== : " + (obj3 == obj4));
		System.out.println("equals()" + obj3.equals(obj4));
	}
}

// 실행 결과
/*
Integer objN = 300
== : false
equals() : true

Integer objN = 30
== : true
equals()true
*/

// 어느값이 모를지에는 equals() 메소드를 사용한다.
