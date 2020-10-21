package chap11.object.toString;

public class MyClass extends Object { //있든 없든 무조건 extends Object 왜냐하면 모든 클래슨느 object 하위
	
	private int age;
	private String name;
	private String password;
	
	public void setFields(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyClass [age=" + age + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
