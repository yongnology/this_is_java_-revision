package sec06;
// �� ������� �迭 ����
public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		// �迭 ���� ����� �迭 ����
		String[] seasson = { "Spring", "Summer", "Fall", "Winter" };
		
		// �迭�� �׸� �б�
		for(int i=0; i<seasson.length; i++) {
			System.out.println("seasson["+i+"] : " + seasson[i]);
		}
		
		// �ε��� 1�� �׸� �� ����
		seasson[1] = "����";
		System.out.println("season[1] : " + seasson[1]);
		System.out.println();
		
		// �迭 ���� ����� �迭 ����
		int[] scores = {83, 90, 87};
		
		// ����, ���
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double)sum / 3;
		System.out.println("��� : " + avg);
	}
}
