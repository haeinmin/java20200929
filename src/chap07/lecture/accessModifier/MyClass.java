package chap07.lecture.accessModifier;

public class MyClass {
	// public / protected / () default, package private / private
	// public: 모두 사용 가능
	// protected: 다른 패키지에 있더라도 상속받은 클래스일 시 접근 가능
	// (): 패키지 내 사용 가능
	// private: 동일 클래스 내에서만 사용 가능
	
	public int publicVar;
	protected int protectedVar;
	int defaultVar;
}
