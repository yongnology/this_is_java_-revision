package sec07;
// Random
import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber = new int[6];	// 선택번호 6개가 저장될 배열 생성
		Random random = new Random(3);		// 선택번호를 얻기 위한 Random 객체 생성
		System.out.print("선택번호 : ");
		for(int i=0; i<selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호 : ");
		for(int i =0; i<winningNumber.length; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨되었습니다");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}

// 실행결과
/*
선택번호 : 15 21 16 17 34 28 
당첨번호 : 18 38 45 15 22 36 
당첨 여부 : 당첨되지 않았습니다.
*/

// Random random = new Random(3); 종자값 3대신 5를 넣으면 당첨번호로 나온다.
