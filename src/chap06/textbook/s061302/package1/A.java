package chap06.textbook.s061302.package1;

public class A { //class는 접근제한자를 public 또는 default만 받을 수 있음
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}

}
