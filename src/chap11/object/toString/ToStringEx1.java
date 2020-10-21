package chap11.object.toString;

public class ToStringEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		String s = o1.toString();
		System.out.println(s); //chap11.objecttoString.MyClass@15db9742
		
		MyClass o2 = new MyClass();
		String s2 = o2.toString();
		System.out.println(s2);
		
		System.out.println(s2.toString());
		System.out.println(s2); //상동
	}
	
}
