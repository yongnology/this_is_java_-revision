package sec07.exam01;

class A {
}

class B extends PromotionExample {
}

class C extends PromotionExample {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// �ڵ� Ÿ�� ��ȯ(��� ���迡 ����)
		PromotionExample a1 = b;
		PromotionExample a2 = c;
		PromotionExample a3 = d;
		PromotionExample a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// ������ ����(��� ������ ���� ����)
		/*
		B b3 = e;
		C c2 = d;
		*/
	}
}