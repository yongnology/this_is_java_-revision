package sec05;
// ���ڿ� �и�
public class SplitExample {
	public static void main(String[] args) {
		String board = "1,�ڹ� �н�,���� Ÿ�� String�� �н��մϴ�.,ȫ�浿";
		
		// ���ڿ� �и�
		String[] tokens = board.split(",");

		// for ���� �̿��� �б�
		for(int i=0; i< tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
	}
}

// ���� ���
/*
1
�ڹ� �н�
���� Ÿ�� String�� �н��մϴ�.
ȫ�浿
*/
