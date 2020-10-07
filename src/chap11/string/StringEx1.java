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
		
		//indexOf 문자열 출력
		String str7 = "자바 프로그래밍";
		int index = str7.indexOf("로");
		int index1 = str7.indexOf("자바로"); //-1 출력됨. 존재하지 않는 문자열이라서.
		System.out.println(index);
		
		//length
		String str8 = "이것이 자바다.       java";
		int length = str8.length();
		System.out.println(length);
		System.out.println(str8.charAt(length-1)); 
		
		//replace
		String str9 = "abcdefabcdefg";
		String replace = str9.replace("abc", "123");
		System.out.println(replace);
		
		//substring
		String str11 = "0123456789";
		String s1 = str11.substring(2, 3); //두번째 이상 세번째 미만 문자 출력
		System.out.println(s1);
		String s2 = str11.substring(7);
		System.out.println(s2);
		
		// trim 공백 제거
		String str12 = "java";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
	}

}
