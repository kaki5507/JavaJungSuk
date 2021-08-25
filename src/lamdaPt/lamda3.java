package lamdaPt;

import java.util.*;
import java.util.function.*;

public class lamda3 {

	public static void main(String[] args) {
		Supplier<Integer> s = ()-> (int)(Math.random()*100)+1; // 1~100 난수
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2==0;
		Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앤다.
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		
		// 짝수를 출력
		printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			list.add(s.get());
		}
	}

	//짝수인지 검사 Predicate, 어떻게 출력 Consumer, list에 담아 줌.
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) // 짝수인지 검사
				c.accept(i); // 짝수면 Consummer 출력
		}
		System.out.println("]");
	}
	
	// 1의 자리 없애는 람다식 Function 그리고 list를 받아왔음
	static <T> List<T> doSomething(Function<T, T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}
}
