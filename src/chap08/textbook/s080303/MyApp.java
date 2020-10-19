package chap08.textbook.s080303;

import chap08.textbook.s080301.RemoteControl;

public class MyApp {
	public static void main(String[] args) {
		SmartTelevision o1 = new SmartTelevision();
		RemoteControl r1 = o1;
		Searchable s1 = o1;
		
		s1.search("daum");
//		s1.turnOn();
//		s1.turnOff();
		
		r1.turnOn();
		r1.turnOff();
		r1.setVolume(3);
//		r1.search("google");
		
	}

}
