package chap13.textbook.s130202;

public class Box<T, K> { //아래에 T로 되어있는 건 T로 치환, K는 K
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
