package chap05;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {99, 88, 77};
		int[] arr2 = {99, 88, 77}; //  @@@왜 new 없이 가능? 이렇게 한 줄로 선언부터 지정까지 할 경우만 생략 가능
		
		arr1 = new int[] {1, 2, 3};
//		arr1 = {1, 2, 3};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("------------");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3;
		int[] arr4;
		
		arr3 = new int[] {11,22,33};
		arr4 = {11, 22, 33}; // @@@왜 불가? 선언과 지정이 두 줄로 구분되어 있어서
	}

}
