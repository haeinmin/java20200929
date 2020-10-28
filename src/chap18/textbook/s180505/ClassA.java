package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable {
	static final long serialVersionUID = 1L;
	
	int field1; 
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
}

//모든 게 직렬화되는 거 아님
// instance field만
// static x, transient x