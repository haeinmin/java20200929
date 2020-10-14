package chap06.lecture.encapsulation;

public class MyApp {
	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.speed = 100;
//		System.out.println(c1.speed);
//		c1.speed = -100;
		// field가 private이라 위는 불가능
		
		c1.setSpeed(300); //대신 method로 접근
//		System.out.println(c1.speed); //field가 private이라 이것도 오류 발생. 따라서 가져오는 기능을 method에 추가.
		System.out.println(c1.getSpeed());
		
		c1.setSpeed(-300);
		System.out.println(c1.getSpeed()); //여전히 300
	}
}
