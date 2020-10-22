package chap06.lecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD}) //어디어디에 적용할지
@Retention(RetentionPolicy.RUNTIME) //언제까지 유지될지
public @interface MyAnnotation {
	String value() default "123";
	int number() default 3;
	String[] names() default {"a", "b"};
	
	
}
