package sec04;
// 객체 생성과 클래스 변수
public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조");
	}
}

// 실행 결과
/*
s1 변수가 Student 객체를 참조
s2 변수가 또 다른 Student 객체를 참조
*/
