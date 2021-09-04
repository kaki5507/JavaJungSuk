package Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntStream intStream = new Random().ints();
//		IntStream intStream = new Random().ints(1,45);
//		intStream.limit(6).forEach(System.out::println);
//		
		
		Stream<Integer> intStream = Stream.iterate(0, n -> n+2);
		intStream.limit(10).forEach(System.out::println);
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::println);
	}

}
