package chap06.lecture.finalKeyword;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "123564-9876543"
		p1.name = "을지문덕";
		System.out.println(p1.name);
	}

}
