package sec10;
// �迭 �׸� �ݺ��� ���� ���� for��
public class AdbanceForExample {
	public static void main(String[] args) {
		
		// �迭 ���� ����� �迭 ����
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("���� ���� : " + sum);
		
		// �迭 �׸� ��ü ��� ���ϱ�
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� : " + avg);
	}
}

// ���� ���
/*
���� ���� : 430
���� ��� : 86.0
*/
