package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		//순서 없고 중복되지 않음
		Set<String> set = new HashSet<>();
		
		//추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("jsp");
		set.add("dbms");
		set.add(new String("java"));
		set.add("java"); //동일한 값은 입력되지 않음
		
		System.out.println(set.size()); //3
		
		// 동일한 객체인지를 결정하는 것은 hashcode, equals로
		
		set.remove("jquery");
		System.out.println(set.size());
		set.remove("html");
		set.remove(new String("html")); //hashcode, equals로 따져서 위와 동일한 효과
		System.out.println(set.size());
		
		// 수정하는 method 따로 없음. 순서가 없어서 딱 골라내지를 못하니까
		
		// 검색도 순서가 없으니 모든 걸 뒤져야 함
		System.out.println("=========enhanced for");
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("===========iterator");
		Iterator<String> iter = set.iterator(); //탐색하기 위한 목적으로 만들어진 class
//		iter.hasNext(); //다음에 탐색할 값이 있는지 확인
//		iter.next(); //실제로 다음 element return해주는 method
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		
	}
}
