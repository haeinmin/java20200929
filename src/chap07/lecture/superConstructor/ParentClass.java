package chap07.lecture.superConstructor;

public class ParentClass {
//	public ParentClass() {
//		
//	}
	
	public ParentClass(itn a) { //이럴 경우 위의 argument 없는 생성자가 자동 생성되지 않으므로 child class에서 문제 발생
								
	}
	
	void method1() {
		System.out.println("parent method1");
	}

}
