package sec05;
// ���ڿ� ã��
public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("�ڹ�");
		if(location != -1) {
			System.out.println("�ڹٿ� ���õ� å");
		} else {
			System.out.println("�ڹٿ� ���� ���� å");
		}
		
		boolean result = subject.contains("�ڹ�");
		if(result) {
			System.out.println("�ڹٿ� ���õ� å");
		} else {
			System.out.println("�ڹٿ� ���� ���� å");
		}
	}
}

// ����
/*
 * .indexOf() �޼ҵ�� ���ԵǾ� ���� ������ -1 ����
 * .contains() �޼ҵ�� ���ڿ��� ���ԵǾ� ������ true
 * */

// ���� ���
/*
3
���α׷���
�ڹٿ� ���õ� å
�ڹٿ� ���õ� å
*/
