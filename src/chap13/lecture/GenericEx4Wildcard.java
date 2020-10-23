package chap13.lecture;

import chap13.textbook.s130601.*;

public class GenericEx4Wildcard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인", 5);
		Course<Student> courseStudent = new Course<>("학생", 5);
		
		Person p = new Person("일반");
		Student s = new Student("학생");
		
		p = s;
		
		courseStudent.add(new Student("hong"));
		coursePerson.add(new Person("kim"));
		
//		coursePerson = courseStudent;
		coursePerson.add(new Person("lee"));
		
		System.out.println("wildcard");
		Course<? super Student> courseW0 = new Course<Object>("a", 1);
		Course<? super Student> courseW1 = new Course<Person>("a", 1);
		// <?> wildcard
		// <? super Student>의 경우 자신과 상위클래스만 parameter로 사용 가능
		
		Course<? super Student> courseW2 = new Course<Student>("a", 1);
//		Course<? super Student> courseW3 = new Course<HighStudent>("a", 1);
		
		courseW0.add(new Student("a"));
		courseW1.add(new Student("a"));
		courseW2.add(new Student("a")); //위에서 student 상위 클래스 보장받았으므로 가능
//		courseW0.add(new Object()); //parameter가 상위인 건 불가능 보장 없으므로
		
		Course<Object> co = (Course<Object>) courseW0;
		co.add(new Object()); //이건 됨
		
		Course<? extends Student> courseE1 = new Course<Student>("a", 5);
		Course<? extends Student> courseE2 = new Course<HighStudent>("a", 5);
		
		Course<?> courseA1 = new Course<Person>("a", 5);
		Course<?> courseA2 = new Course<Worker>("a", 5);
		Course<?> courseA3 = new Course<Student>("a", 5);
		Course<?> courseA4 = new Course<HighStudent>("a", 5);
		
	}
}
