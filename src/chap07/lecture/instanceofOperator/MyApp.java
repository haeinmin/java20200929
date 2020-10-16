package chap07.lecture.instanceofOperator;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
//		SubClass o2 = (SubClass) o1;
//		SubClass2 o3 = (SubClass2) o1; //subclass 간에는 강제형변환 불가. 문법상 오류는 아니지만.
										// 이러한 상황을 방지하기 위해 instanceof 사용
		
		// instanceof: 좌변이 참조변수, 우변이 타입
		// 결과: boolean
		System.out.println(o1 instanceof SuperClass);
		System.out.println(o1 instanceof SubClass);
		System.out.println(o1 instanceof SubClass2);
		
		if (o1 instanceof SubClass) {
			SubClass o2 = (SubClass) o1;
		}
		
		if (o1 instanceof SubClass2) {
			SubClass2 o3 = (SubClass2) o1;
		}
	}

}
