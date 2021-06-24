package Generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Generics {
	
	public static <T extends Number> double sum(Collection<T> c) {
		double sum = 0;
		for (T t: c) 
			sum += t.doubleValue();
		return sum;
	}
	
	public static <T extends Number> boolean addToList(List<T> list, T x){
		return list.add(x);
	}
	
	public static void main(String[] args) {
		List<String> src = Arrays.asList("A","B","C");
		Collections.shuffle(src);
		
		List<Object> dest = Arrays.asList("D","E","F");
		Collections.copy(dest, src);
		System.out.println(dest);
		
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(1);
		numbers.add(2.0);
		numbers.add(3.0f);
		addToList(numbers, 0);
		System.out.println(numbers);
	}

}