package sec05;
// ����, ���ڿ� ��
public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		
		// ���� ��
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		// ���ڿ� ��
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVal2�� ���ڿ��� ����");
		} else {
			System.out.println("strVar1�� strVar2�� ���ڿ��� �ٸ�");
		}
		
		System.out.println("--------------------------------------"); 
		
		String strVar3 = new String("ȫ�浿");
		String strVar4 = new String("ȫ�浿");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		// ���ڿ� ��
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1�� strVal2�� ���ڿ��� ����");
		} else {
			System.out.println("strVar1�� strVar2�� ���ڿ��� �ٸ�");
		}
	}
}

// ���� ���
/*
strVar1�� strVar2�� ������ ����
strVar1�� strVal2�� ���ڿ��� ����
--------------------------------------
strVar1�� strVar2�� ������ �ٸ�
strVar1�� strVal2�� ���ڿ��� ����
*/
