package sec07;
// �� ������� ������ �迭 ����
public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		
		// 2���� �迭 ����
		int[][] scores = {
				{80, 90, 96},
				{76, 88 }
		};
		
		// �迭�� ����
		System.out.println("1���� �迭 ����(���� ��) : " + scores.length);
		System.out.println();
		
		System.out.println("2���� �迭 ����(ù ��° ���� �л� ��) : " + scores[0].length);
		System.out.println("2���� �迭 ����(�� ��° ���� �л� ��) : " + scores[1].length);
		System.out.println();
		
		// ù ��° ���� �� ���� �л��� ���� �б�
		System.out.println("scores[0][2] : " + scores[0][2]);
		// �� ��° ���� �� ��° �л��� ���� �б�
		System.out.println("scores[1][1] : " + scores[1][1]);
		// ù ��° ���� ��� ���� ���ϱ�
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.println();
		
		double class1Avg = (double)class1Sum / scores[0].length;
		System.out.println("ù ��° ���� ��� ���� : " + class1Avg);
		
		// �� ��° ���� ��� ���� ���ϱ�
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("�� ��° ���� ��� ���� : " + class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("��ü �л��� ��� ���� : " + totalAvg);
	}
}

// ���� ���
/*
1���� �迭 ����(���� ��) : 2

2���� �迭 ����(ù ��° ���� �л� ��) : 3
2���� �迭 ����(�� ��° ���� �л� ��) : 2

scores[0][2] : 96
scores[1][1] : 88

ù ��° ���� ��� ���� : 88.66666666666667
�� ��° ���� ��� ���� : 82.0
��ü �л��� ��� ���� : 86.0
*/
