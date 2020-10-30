package chap14.lecture.api.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConsumerEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("java", 9);
		map.put("html", 3);
		map.put("css", 5);
		map.put("jsp", 2);
		map.put("servlet", 4);
		map.put("jquery", 3);
		
		//탐색할 때 for, entry, keyset 등등 없이 BiConsumer type 객체의 forEach 사용하면 됨
		
		map.forEach((k,v) -> System.out.println(k + ":" + v)); 
		
		System.out.println("============keyset 사용");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
