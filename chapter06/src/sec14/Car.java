package sec14;
// Getter�� Setter
public class Car {

	// �ʵ� ����
	private int speed;
	private boolean stop;
	
	// speed �ʵ�� Getter/Setter ����
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	// Stop �ʵ��� Getter/Setter ����
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
