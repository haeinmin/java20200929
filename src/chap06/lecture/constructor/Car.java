package chap06.lecture.constructor;

public class Car {
	String name;
	int price;
	
	
	//생성자 (클래스와 이름 동일)
	//클래스명(parameter 목록) {
	//	 실행코드;
	// }
	// 주로 필드를 초기화하는 데 사용함
	
	public Car() {
		System.out.println("생성자 실행됨");
		name = "kia";
		price = 500;		
	}
	
	public Car(String carName) {
		System.out.println("String 받는 생성자 실행됨");
		System.out.println(carName);
		name = carName;
	}
	
	public Car(String carName, int carPrice) {
		name = carName;
		price = carPrice;
	}
	
	//parameter의 개수와 타입을 보고 동명의 class 중 어떤 것을 호출할지 결정
}

