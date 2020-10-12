package chap05;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		
		int[] arr = new int[3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);
		// matrix는 배열을 저장한 배열이기 때문에 원소도 배열
		
		System.out.println(matrix[1].length);
		//두번째 원소의 길이도 1
		
		System.out.println(matrix[2].length);
		
		System.out.println(matrix[3].length);
		//네번째 원소는 존재하지 않음
		
		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;
		
		matrix[0][0] = 9;
		matrix[2][0] = 1;
		
	}

}
