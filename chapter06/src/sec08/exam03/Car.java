package sec08.exam03;

public class Car {
	// 필드 선언
	int gas;
	
	// 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 리턴값이 boolean만 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;			
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴하고 메소드 종료
	}
	
	// 리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas 잔량 : " + gas + "L)");
				gas -=1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + "L)");
				return;
			}
		}
	}
}
