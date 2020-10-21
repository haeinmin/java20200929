package chap05.lecture.enumType;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1 instanceof Object);
		
		MyEnum e1 = MyEnum.VALUE1;
		MyEnum e2 = MyEnum.VALUE2; //상수처럼 쓰는 것과 유사함
		MyEnum e3 = MyEnum.VALUE3;
		
		System.out.println(e2 == e3);
		System.out.println(e1.toString()); //object가 아닌 enum이 재정의한 tostring 호출됨
	}
}

class MyClass {
	
}
