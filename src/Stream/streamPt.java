package Stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamPt {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream2 = list.stream(); // list를 Stream으로 변환
		intStream2.forEach(System.out::print); // forEach()최종연산

		// stream 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
		intStream2 = list.stream(); // list로부터 stream을 생성
		intStream2.forEach(System.out::print);

		String[] strArr = { "a", "b", "c", "d" };
//		Stream<String> strStream = Stream.of(new String[] {"a","b","c","d"});
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);

		int[] intArr = { 1, 2, 3, 4, 5 };
		Arrays.stream(intArr);
		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
//		System.out.println("count="+intStream.count());
//		System.out.println("sum="+intStream.sum());
		System.out.println("average="+intStream.average());

		Integer[] intArr2 = { 1, 2, 3, 4, 5 };
		Arrays.stream(intArr2);
		Stream<Integer> intStream3 = Arrays.stream(intArr2);
		intStream3.forEach(System.out::println);
	}
}
