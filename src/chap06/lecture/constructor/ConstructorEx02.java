package chap06.lecture.constructor;

public class ConstructorEx02 {
	public static void main(String[] args) {
		Hero h1 = new Hero("captainmarvel", 100);
		Hero h2 = new Hero("Hela", 80);
		System.out.println(h1.name);
		System.out.println(h1.power);
		System.out.println(h2.name);
		System.out.println(h2.power);
		
		Hero h3 = new Hero("blackwidow");
		System.out.println(h3.name);
		System.out.println(h3.power);
	}
	
}
