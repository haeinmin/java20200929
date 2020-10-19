package chap08.textbook.s080301;

public interface RemoteControl {
	public int MAX_VOLUME = 10; // public static final 생략 가능
	public int MIN_VOLUME = 0;
	
	void turnOn(); // public abstract 생략 가능
	public void turnOff();
	public void setVolume(int volume);

	default void setMute(boolean mute) { // public 생략 가능
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() { // public 생략 가능
		System.out.println("건전지를 교환합니다.");
	}
}





