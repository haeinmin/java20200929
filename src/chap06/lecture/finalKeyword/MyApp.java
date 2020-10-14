package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j;
		
		i = 30;
		i = 40;
		
		j = 20;
//		j = 10; //j는 final이기 때문에 한번만 값을 할당받을 수 있어서 오류 발생.
		
		MyClass o1 = new MyClass();
		o1.field1 = 3;
//		o1.field2 = 4; //이미 할당되어서 재할당 불가.
		
	}

}
