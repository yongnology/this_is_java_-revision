package sec08.exam02;
// �������� �Ű�����
public class Computer {
	// �������� �Ű������� ���� �޼ҵ� ����
	int sum(int ... values) {
		int sum = 0;
		
		// values�� �迭 Ÿ���� ����ó�� ���
		for(int i=0; i< values.length; i++) {
			sum += values[i];
		}
		
		// �ջ� ����� ����
		return sum;
	}
}
