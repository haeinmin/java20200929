package chap15.textbook.s150401;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95); //이미 있는 것을 덮어씀
		
		System.out.println("총 entry 수: " + map.size());
	}
}
