package chap13.textbook.s130202;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get(); //굉장히 안전한 코드로 instanceof 등의 필요가 없어짐
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
	}
}
