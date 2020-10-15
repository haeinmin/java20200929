package chap07.textbook.exercises.q6;

public class Child extends Parent {
	private String name;
	
	
	//1. 따로 부모 class를 호출하지 않아 자동으로 super(); 생성
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}

}
