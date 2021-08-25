package wrapper;

import java.util.ArrayList;

public class wrapperTests {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100)); // list에 객체만 추가 가능
		list.add(100); // JDK1.5 이전에는 에러.
		
//		Integer i = list.get(0); // list에 첫번째 객체를 꺼낸다.
		int i = list.get(0).intValue();
		int i2 = list.get(0);
	}

}
