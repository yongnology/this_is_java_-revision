package sec08.exam01;

public class KumhoTire extends Tire {
	// 메소드 재정의(오버라이딩)
	
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전한다.");
	}
}
