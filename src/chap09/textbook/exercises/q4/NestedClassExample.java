package chap09.textbook.exercises.q4;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
				
		Car.Engine engine = new Car.Engine(); //static이라 바로 class로 접근
	}
}
