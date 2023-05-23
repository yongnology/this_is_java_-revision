package sec07;
// new �����ڷ� ������ �迭 ����
public class MultidmensionalArrayByNewExample {
	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		
		// ��Ť��� �׸� �ʱⰪ ���
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.print("mathScores["+ i + "]["+ k + "] : " + mathScores[i][k]);
			}
			System.out.println();
		}
		// �迭 �׸� �� ����
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		// ��ü �л� ���� ��� ���ϱ�
		int totalStudent = 0;
		int totalMathSum = 0;
		for(int i=0; i<mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for(int k=0; k<mathScores[i].length; k++) {
				totalMathSum += mathScores[i][k];
			}
		}
		
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("��ü �л��� ���� ��� ���� : " + totalMathAvg);
		System.out.println("-------------------------------\n");
		
		// �� ���� �л� ���� �ٸ� ��� ���� ������ ���� 2���� �迭 ����
		int[][] englishScores= new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		// �迭 �׸� �ʱⰪ ���
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.print("englishScores[" + i + "][" + k + "] : "+ englishScores[i][k]);
			}
			System.out.println();
		}
		
		// �迭 �׸� �� ����
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		// ��ü �л��� ���� ��� ���ϱ�
		totalStudent = 0;
		int totalEnglishSum = 0;
		for(int i=0; i< englishScores.length; i++) {
			totalStudent += englishScores[i].length;
			for(int k=0; k< englishScores[i].length; k++) {
				totalEnglishSum += englishScores[i][k];
			}
		}
		double totalEnglishAvg = (double) totalEnglishSum /totalStudent;
		System.out.println("��ü �л��� ���� ��� ���� : " + totalEnglishAvg);
	}
}

// ���� ���
/*
mathScores[0][0] : 0mathScores[0][1] : 0mathScores[0][2] : 0
mathScores[1][0] : 0mathScores[1][1] : 0mathScores[1][2] : 0
��ü �л��� ���� ��� ���� : 86.0
-------------------------------

englishScores[0][0] : 0englishScores[0][1] : 0
englishScores[1][0] : 0englishScores[1][1] : 0englishScores[1][2] : 0
��ü �л��� ���� ��� ���� : 92.0
*/
