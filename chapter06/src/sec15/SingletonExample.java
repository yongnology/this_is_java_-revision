package sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		// ���� �޼ҵ带 ȣ���ؼ� �̱��� ��ü ����
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// ������ ��ü�� �����ϴ��� Ȯ��
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}
}

// ���� ���
/*
���� Singleton ��ü�Դϴ�.
*/
