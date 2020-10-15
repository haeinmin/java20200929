package chap07.lecture.superConstructor;

public class ChildClass extends ParentClass {
	
	public ChildClass() { //argument 없는 costructor 같지만 실은 밑에 super(); 숨겨져 있음
//		super(); 	//이 키워드 사용하기 위해서는 부모클래스에 argument 없는 constructor 필요
	}
	
	@Override
	void method1() {
		super.method1();
		System.out.println("child class");
	}
}
