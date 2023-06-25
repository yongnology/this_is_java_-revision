package chapter08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
		System.out.println("---1---");
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
		System.out.println("---2---");
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}

// 실행 결과
/*
InterfaceImpl-methodA() 실행
---1---
InterfaceImpl-methodB() 실행
---2---
InterfaceImpl-methodA() 실행
InterfaceImpl-methodB() 실행
InterfaceImpl-methodC() 실행
*/
