package chap07.textbook.exercises.q6;

public class Parent {
	public String nation;
	
	public Parent() { //2. 이게 불러져왔으나 첫번째 하는 일이
		this("대한민국"); // 이것 호출하는 것이므로
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation = nation; // 3. 얘가 가장 먼저
		System.out.println("Parent(String nation) call");
		}
	}

