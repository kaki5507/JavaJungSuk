package HashMapPt;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSchool {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바",100);
		map.put("김자바",200);
		map.put("이자바",300);
		map.put("박자바",400);
		
		Set set = map.entrySet(); // 키와 밸류 같이 가져옴
		
		Iterator it = set.iterator();
		
		// true일 때 돌아감
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+"번호 : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+set);
		
		Collection values = map.values();
		System.out.println(values);
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total/set.size());
		System.out.println("최고점수 : "+Collections.max(values));
		System.out.println("최저점수 : "+Collections.min(values));
	}

}
