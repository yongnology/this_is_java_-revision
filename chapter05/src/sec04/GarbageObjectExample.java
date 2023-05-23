package sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;
		
		String kind1 = "자동차";
		String kind2 = kind1;	//kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null;
		System.out.println("kind2 = " + kind2);
	}
}

// 실행 결과
/*
kind2 = 자동차
*/
