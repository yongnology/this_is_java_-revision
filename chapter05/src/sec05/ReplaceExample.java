package sec05;
// ���ڿ� ��ü
public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. [�ڹ�]";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

// ���� ���
/*
�ڹ� ���ڿ��� �Һ��Դϴ�. [�ڹ�]
JAVA ���ڿ��� �Һ��Դϴ�. [JAVA]
*/
