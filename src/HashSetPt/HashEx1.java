package HashSetPt;

import java.util.*;
public class HashEx1 {

	public static void main(String[] args) {
		Object[] obj = {"1", new Integer(1), "2","3","3","4","4","4","6"};
		HashSet hs = new HashSet();
		for(int i=0; i<obj.length; i++) {
//			hs.add(obj[i]); // HashSet에 obj의 요소를 추가 함.
			System.out.println(hs.add(obj[i]));
		}
		System.out.println(hs);
		
		//HashSet에 저장된 요소들을 iterator로 출력.
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
