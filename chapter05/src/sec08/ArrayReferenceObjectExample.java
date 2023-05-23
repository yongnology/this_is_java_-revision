package sec08;
// 객체를 참조하는 배열
public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( "strArray[0] == strArray[1] : " + (strArray[0] == strArray[1]) );
		System.out.println( "strArray[1] == strArray[2] : " + (strArray[1] == strArray[2]) );
		System.out.println( "strArray[0].equals(strArray[2]) : " + (strArray[0].equals(strArray[2])) );
	}
}

// 실행 결과
/*
strArray[0] == strArray[1] : true
strArray[1] == strArray[2] : false
strArray[0].equals(strArray[2]) : true
*/
