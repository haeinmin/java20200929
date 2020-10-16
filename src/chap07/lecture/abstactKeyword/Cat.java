package chap07.lecture.abstactKeyword;

public class Cat extends KindaCat {

	@Override
	public void cry() {
		System.out.println("meowwwwww");
	} //parent class에서 abstract method이었음으로 재정의 필수
}
