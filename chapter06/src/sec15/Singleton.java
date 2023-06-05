package sec15;
// �̱��� ����
public class Singleton {
	
	// private ���� ������ ���� ���� �ʵ� ����� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	// private ���� ������ ���� ������ ����
	private Singleton() {
		
	}
	
	// public ���� ������ ���� ���� �޼ҵ� ����
	public static Singleton getInstance() {
		return singleton;
	}
}
