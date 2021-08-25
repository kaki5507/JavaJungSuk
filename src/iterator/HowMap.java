package iterator;

import java.util.*;

public class HowMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put(1, "일");
		map.put(2, "이");
		map.put(3, "삼");
		map.put(4, "사");
		map.put(5, "오");
		
		Iterator it = map.entrySet().iterator();
		System.out.println();
		// 이 한줄은 해석하면
		Set eSet = map.entrySet();
		System.out.println("eSet : " + eSet);
		Set kSet = map.keySet();
		System.out.println("kSet : " + kSet);
		Collection v = map.values();
		System.out.println("v : " + v);
		Iterator it2 = eSet.iterator();
		System.out.println(it2);
		
	}

}
