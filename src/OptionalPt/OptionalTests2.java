package OptionalPt;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTests2 {
	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		
		System.out.println(optStr);
		System.out.println(optInt);
		
		int result1 = Optional.of("123")
						.filter(x->x.length() > 0)
						.map(Integer::parseInt).get();
		
		int result2 = Optional.of("")
						.filter(x->x.length() > 0)
						.map(Integer::parseInt).orElse(-1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		Optional.of("456").map(Integer::parseInt)
						  .ifPresent(x->System.out.printf("result3=%d%n",x));
		
		OptionalInt optInt1 = OptionalInt.of(0);   // 0을 저장
		OptionalInt optInt2 = OptionalInt.empty(); // 빈 객체를 생성
		
		System.out.println(optInt1.isPresent()); // true
		System.out.println(optInt2.isPresent()); // false
	}
}
