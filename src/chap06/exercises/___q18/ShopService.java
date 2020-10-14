package chap06.exercises.___q18;

public class ShopService {
	private static ShopService ins = new ShopService();
	
	private ShopService() {
		
	}
	
	public static Singleton getInstance() {
		return ins;
	}

}
