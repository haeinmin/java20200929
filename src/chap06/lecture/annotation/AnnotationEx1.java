package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEx1 {
	
	@MyAnnotation
	private int i;
	
	
	@Override
	@MyAnnotation
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation(value="abc", number=5, names= {"c","d"}) //METHOD에는 적용 안 하게 했으므로 compile error
	public static void mymethod() {
		
	}
}


// 중복 사용 가능