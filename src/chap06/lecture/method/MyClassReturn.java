package chap06.lecture.method;

public class MyClassReturn {
	int var1;
	
	void method1() {
		System.out.println("메소드1 실행");
		// 리턴이 필요 없는 경우 void로
		
	}
	
	int method2() { //무언가를 return하기 위해서는 return값의 type을 메소드명 앞에 명시해야 함
					// type 지정했는데 return 없는 경우에도 오류
		System.out.println("메소드2 실행");
		return var1*2; //MyAppReturn에서 실행 시 출력 안 됨
						// return: 메소드 종료, 오른쪽에 있는 값을 호출한 곳으로 돌려줌
						// 즉, MyAppReturn에서 o1.metho2() 자체가 var1*2로 치환된 것
		
	}

}

