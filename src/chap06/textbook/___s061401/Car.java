package chap06.textbook.___s061401;

public class Car {
	
	private int speed;
	private boolean stop;
	
	public int getSpeed() { //field 읽는 method
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { //field 읽는 method
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
