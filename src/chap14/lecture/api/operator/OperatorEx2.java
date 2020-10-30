package chap14.lecture.api.operator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class OperatorEx2 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		
		Supplier<Double> sup = () -> Math.random();
		
		while (list.size() < 10) {
			list.add(sup.get());
		}
		
		System.out.println("---------- 값 확인");
		list.forEach(e -> System.out.println(e));
		
//		UnaryOperator<Double> operator = x -> x*2 ;
//		list.replaceAll(operator);
		list.replaceAll(x -> x*2);
		
		System.out.println("---------- 값 확인");
		list.forEach(e -> System.out.println(e));
	}
}
