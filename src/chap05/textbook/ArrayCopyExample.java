package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray , 0, newStrArray, 0, oldStrArray.length);
						// 원본, 원본의 시작 index, copy본, copy본의 시작 index, 개수
						// System.arraycopy는 위처럼 다섯 개의 parameter를 가짐
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}
