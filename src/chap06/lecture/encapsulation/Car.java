package chap06.lecture.encapsulation;

public class Car {
	private int speed;
	private String name;
	private String model;
	private int price;
	
	public void setSpeed(int speed) { //field 대신 method를 노출
		if (speed >= 0) {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
	

}
