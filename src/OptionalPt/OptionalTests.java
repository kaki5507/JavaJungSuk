package OptionalPt;

import java.util.Optional;

public class OptionalTests {

	public static void main(String[] args) {
		Optional<String> opt2 = null; // OK. 하지만 null은 바람직하지 않다.
		Optional<String> opt = Optional.empty();
		System.out.println("opt="+opt);
		//System.out.println("opt="+opt.get()); // null이여서 예외 발생함. get 잘 안씀
		
		String str = "";
		
		try {
			str = opt.get();
		} catch (Exception e) {
			str =""; // 예외 발생하면 ""로 초기화
		}
		
//		str = opt.orElse("EMPTY"); // Optional에 저장된 값이 null이면 ""반환
//		str = opt.orElseGet(() -> new String()); // Optional에 저장된 값이 null이면 ""반환
		str = opt.orElseGet(String::new); // Optional에 지정된 값이 null이면 ""반환
		System.out.println("str="+str);
	}

}
