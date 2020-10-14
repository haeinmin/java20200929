package chap06.textbook.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	// 따라서 내부에서 static으로 생성자 만들어놓음
	
	private Singleton() { //private이라서 class 밖에서 해당 생성자 접근 불가. instance도 만들 수 없음.
		
	}
	
	static Singleton getInstance() { // getInstance 통해서 접근 가능하게끔 함. 참조값 return하여 같은 instance 명시하게 함.
		return singleton;
	}

}
