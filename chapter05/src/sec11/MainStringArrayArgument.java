package sec11;
// main() 메소드의 String[] 매개변수 용도
public class MainStringArrayArgument {
	public static void main(String[] args) {
		// 입력한 데이터 개수가 두 개가 아닌 경우
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// 문자열로 정수로 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
	}
}

// 실행 결과
/*
프로그램 입력값이 부족
*/

// [Run] - [Run Configurations] - {Arguments} 에 [ 10 20 ] : 숫자와 공백만 입력
/*
10 + 20 = 1020
*/
