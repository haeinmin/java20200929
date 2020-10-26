package chap15.textbook.s150402;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>(); //HashMap으로 사용해도 무관 (thread 환경 아닌 이상)
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디: ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			if(map.containsKey(id)) { //containsKey method: entry와 일치하는 key 있는지 확인
				if(map.get(id).equals(password)) { //????????????? 해당하는 key와 password가 equal?
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
