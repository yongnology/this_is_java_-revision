package sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		// Week 열거 타입 변수 선언
		Week today = null;
		
		// Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자를 열거 상수롤 변환해서 변수에 대입
		switch(week) {
			case 1: today = Week.SUNDAY; 	System.out.println("일요일"); break;
			case 2: today = Week.MONDAY; 	System.out.println("월요일"); break;
			case 3: today = Week.THUESDAY; 	System.out.println("화요일"); break;
			case 4: today = Week.WENDSDAY; 	System.out.println("수요일"); break;
			case 5: today = Week.THURSDAY; 	System.out.println("목요일"); break;
			case 6: today = Week.FRIDAY; 	System.out.println("금요일"); break;
			case 7: today = Week.SATURDAY; 	System.out.println("토요일"); break;
		}
		
		// 열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}
}

// 실행 결과
/*
화요일
열심히 자바를 공부합니다.
*/
