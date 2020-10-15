package chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		KindaCat k1 = t1;
//		t1 = k1;
		k1.cry();
		
		Cat c1 = new Cat();
		c1.cry();
		KindaCat k2 = c1;
//		c1 = t1; 고양이과가 고양이인 것은 아니므로 이렇게는 안 됨
		k2.cry();
		
//		c1 = t1;
//		t1 = c1;
	}

}
