package chap15.textbook.exercises.q09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		int[] arr = new int[map.size()];
		int max = 0;
		
		/* keySet
		Set<String> keys = map.keySet();
		for (String key : keys) {
			int value = map.get(key); //***************
			
			totalScore += value;
			
			if (value>maxScore) {
				maxScore = value;
				name = key;
			}
		}
		
		
		 */
		
		//entry set 사용
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String id = entry.getKey();
			int score = entry.getValue();
			
			totalScore += score;
			
			if (score > maxScore) {
				maxScore = score;
				name = id;
			}
		}
		double avg = (double) totalScore / map.size();
		
		System.out.println("평균점수: " + avg);
		System.out.println("최고값: " + maxScore);
		System.out.println("최고값 아이디: " + name);
		
	}
}

//		Set<String> keys = map.keySet();
//		for (String key : keys) {
//			totalScore += map.get(key);
//		}
//		
//		for (String key : keys) {
//			arr = arr.add(map.get(key));
//			for (int i=0;i<arr.length;i++) {
//				if (arr[i] > max) {
//					max = arr[i];
//				}				
//			}
//		
//		int avg = totalScore / map.size();
//		System.out.println("평균점수: " + avg);