package chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		//순서가 있고 중복 허용
		List<String> list = new ArrayList<>();
		
		// 추가
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("java");
		
		System.out.println(list.size());
		
		//검색
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		//수정
		list.set(3, "jsp");
		System.out.println(list.get(3));
		
		//삭제
		list.remove(2);
		System.out.println(list.size());
		System.out.println(list.get(2)); //삭제 시 한칸씩 당겨짐
		
		//모든 값 탐색
		System.out.println("모든 요소 탐색");
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("모든 요소 탐색 enhanced for");
		for (String s : list) {
			System.out.println(s);
		}
		
		// type parameter
		List<Integer> listInt = new ArrayList<>();
		list.add("servlet");
		listInt.add(3);
		
		List listNotype = new ArrayList();
		listNotype.add("string");
		listNotype.add(3);
		
		Object o1 = listNotype.get(0);
		Object o2 = listNotype.get(1);
	}

}
