package chap07.textbook.exercises.q7;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		System.out.println(tire == snowTire); //같은 인스턴스를 가리킴
		
		snowTire.run();
		tire.run();
	}

}
