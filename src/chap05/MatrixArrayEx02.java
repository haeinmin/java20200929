package chap05;

public class MatrixArrayEx02 {
	public static void main(String[] args) {
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[2][];
		// 열의 개수 지정 안 했을 경우? null값 가짐
		mat2[0] = new int[2]; // 추후에 이렇게 지정 가능
							// 첫번째 열에 길이 2의 배열 지정
		mat2[1] = new int[3]; // 꼭 행마다 열의 길이가 같을 필요는 없음
		
		int[] arr1 = null;
		arr1 = new int[4];
	}

}
