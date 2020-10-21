package chap11.object.hashcode;

public class HashCodeEx1 { //참조값을 보여줌, 재정의 경우 제외
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1); //16진법으로 나옴
		System.out.println(o2);
		
		System.out.println(o1.hashCode()); //10진법으로 나옴
		System.out.println(o2.hashCode());
		
		System.out.println("---------------------------");
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1 == s2); //false
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); //하지만 참조값 같음. overriding해서 같은 문자열인 경우 참조값 같음
	}
}


// hashcode의 쓰임새?
// 다른 객체를 같은 카테고리에 속하도록 함?