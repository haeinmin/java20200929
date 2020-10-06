package chap11.string;

public class StringEx1 {
	public static void main(String[] args) {
		// charAt
		String str1 = "java";
		char c1 = str1.charAt(2);
		System.out.println(c1);
		
		//equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4+str5;
		
		System.out.println(str2 == str3);
		System.out.println(str2 == str6);
		System.out.println(str2.equals(str6));
		
		//indexOf
		String str7 = "자바 프로그래밍";
		int index = str7.indexOf("로");
		int index1 = str7.indexOf("자바로"); //-1 출력됨. 존재하지 않는 문자열이라서.
		System.out.println(index);
		
	}

}
