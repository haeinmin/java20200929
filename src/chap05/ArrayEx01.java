package chap05;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		
		int[] arr1; // 요소 type이 int인 array를 만들고 이를 arr1이라 명명?
		arr1 = new int[3]; //arr1에 int type 요소 3개 생성
				
		System.out.println(arr1[0]); //arr1의 0번 요소 
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//출력값은 0, 따로 지정 안 하면 0이라는 뜻?
		
		arr1[0] = 99; //값을 따로 부
		arr1[1] = 88;
		arr1[2] = 77;
		
		System.out.println(arr1[0]);  
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		int[] arr2;
		arr2 = arr1; //arr2와 arr1의 요소들은 같은 값을 가짐
		arr2[0] = 55;
		
		System.out.println(arr2[0]);
		System.out.println(arr1[0]); //arr1의 0번째 요소값도 바뀜?
	}

}
