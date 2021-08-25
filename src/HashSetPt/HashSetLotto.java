package HashSetPt;

import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=1; i<7; i++) {
			set.add((int)(Math.random()*45)+1);
			// 만약에 i가 size()랑 같지않으면 중복된 값때문에 size가 안올라갔으므로 실행 x
			if(i != set.size()) {
				return; // 실행 중인 구문을 종료하고 메서드로 돌아간다.
			}
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
