package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE4;
		System.out.println(e1.name());
		System.out.println(e1.ordinal());
		
		MyEnum e2 = MyEnum.valueOf("VALUE3");
		System.out.println(e2.name());
		
		int diff = e1.compareTo(e2); //결과값이 양수,음수임에 따라 어느것이 먼저 있는지 판단 가능 0이라면 같은 객체임을 알 수 있음
		System.out.println(diff);
		System.out.println(e2.compareTo(e1));
		
		MyEnum[] arr = MyEnum.values(); //MyEnum의 원소 가진 배열 ㄱreturn
		System.out.println(arr.length);
		System.out.println(arr);
	}
}
