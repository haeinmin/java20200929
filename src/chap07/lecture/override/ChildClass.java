package chap07.lecture.override;

public class ChildClass extends ParentClass {
	
	void method2() {
		System.out.println("child method");
	}
	
	//child class에서 parent class 코드 수정 가능 (overriding)
	//단, 코드블럭만 수정 가능
	//나머지 method, parameter 등등은 유지해야 함
	
	@Override //annotation 의미 있는 주석
	void method1() {
		System.out.println("chidl method!!!!!!!!!!");
	}
}
