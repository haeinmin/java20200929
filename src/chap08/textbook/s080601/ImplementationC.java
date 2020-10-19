package chap08.textbook.s080601;

public class ImplementationC implements InterfaceC {
	
	//methodA, B, C 다 실행해야 컴파일 에러 x
	
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}

}
