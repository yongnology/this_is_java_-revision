package sec07.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		
		// Korean ��ü ����
		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println();
		
		// �� �ٸ� Korean ��ü ����
		Korean k2 = new Korean("���ڹ�", "930525-0654321");
		System.out.println("k1.nation : " + k2.nation);
		System.out.println("k1.name : " + k2.name);
		System.out.println("k1.ssn : " + k2.ssn);
		System.out.println();
		
	}
}

// ���� ���
/*
k1.nation : ���ѹα�
k1.name : ���ڹ�
k1.ssn : 011225-1234567

k1.nation : ���ѹα�
k1.name : ���ڹ�
k1.ssn : 930525-0654321
*/
