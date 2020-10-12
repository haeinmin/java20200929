package chap05.textbook;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3]; //현재로서는 null null null인 array
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
