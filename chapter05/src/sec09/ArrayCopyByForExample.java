package sec09;
// �迭 ����
public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		int[] oldIntArray = {1, 2, 3};
		
		int[] newIntArray = new int[5];
		
		// �迭 ����
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		// �迭 �׸� ���
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}

// ���� ���
/*
1, 2, 3, 0, 0, 
*/
