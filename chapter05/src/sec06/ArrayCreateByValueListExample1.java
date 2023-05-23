package sec06;
// 값 목록으로 배열 생성
public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		String[] seasson = { "Spring", "Summer", "Fall", "Winter" };
		
		// 배열의 항목값 읽기
		for(int i=0; i<seasson.length; i++) {
			System.out.println("seasson["+i+"] : " + seasson[i]);
		}
		
		// 인덱스 1번 항목 값 변경
		seasson[1] = "여름";
		System.out.println("season[1] : " + seasson[1]);
		System.out.println();
		
		// 배열 변수 선언과 배열 생성
		int[] scores = {83, 90, 87};
		
		// 총합, 평균
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
	}
}
