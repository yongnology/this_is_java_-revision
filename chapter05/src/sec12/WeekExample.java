package sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		// Week ���� Ÿ�� ���� ����
		Week today = null;
		
		// Calendar ���
		Calendar cal = Calendar.getInstance();
		
		// ������ ���� ���(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// ���ڸ� ���� ����� ��ȯ�ؼ� ������ ����
		switch(week) {
			case 1: today = Week.SUNDAY; 	System.out.println("�Ͽ���"); break;
			case 2: today = Week.MONDAY; 	System.out.println("������"); break;
			case 3: today = Week.THUESDAY; 	System.out.println("ȭ����"); break;
			case 4: today = Week.WENDSDAY; 	System.out.println("������"); break;
			case 5: today = Week.THURSDAY; 	System.out.println("�����"); break;
			case 6: today = Week.FRIDAY; 	System.out.println("�ݿ���"); break;
			case 7: today = Week.SATURDAY; 	System.out.println("�����"); break;
		}
		
		// ���� Ÿ�� ������ ���
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹٸ� �����մϴ�.");
		}
	}
}

// ���� ���
/*
ȭ����
������ �ڹٸ� �����մϴ�.
*/
