package chap07.lecture.superKeyword;

public class ChildClass extends ParentClass {
	
	@Override //ctrl+space bar 자동으로 override 할 목록 보여줌
	void method1() {
		super.method1();
		System.out.println("child method1");
	}
	
	// 완전 덮어쓰는 게 아니라 일부 추가하고 싶다면?
	// super keyword 활용
}
