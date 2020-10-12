package chap06.lecture.constructor;

public class Hero {
	String name;
	int power;
	
	public Hero(String name, int power) {
		this.name = name; //동명일 경우 앞에 this를 붙여 field임을 명시
		this.power = power;
	}
	
	public Hero(String name) {
		// this.name = name;
		// this.power = 100; //초기값 설정
		// 아래와 같이 한 줄로 작성 가능
		this(name, 100);
	}
}
