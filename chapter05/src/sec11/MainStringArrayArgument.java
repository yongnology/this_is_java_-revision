package sec11;
// main() �޼ҵ��� String[] �Ű����� �뵵
public class MainStringArrayArgument {
	public static void main(String[] args) {
		// �Է��� ������ ������ �� ���� �ƴ� ���
		if(args.length != 2) {
			System.out.println("���α׷� �Է°��� ����");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// ���ڿ��� ������ ��ȯ
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
	}
}

// ���� ���
/*
���α׷� �Է°��� ����
*/

// [Run] - [Run Configurations] - {Arguments} �� [ 10 20 ] : ���ڿ� ���鸸 �Է�
/*
10 + 20 = 1020
*/
