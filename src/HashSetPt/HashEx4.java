package HashSetPt;

import java.util.HashSet;
import java.util.Iterator;

public class HashEx4 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");		setA.add("2");		setA.add("3");
		setA.add("4");		setA.add("5");
		
		setB.add("4");		setB.add("5");		setB.add("6");
		setB.add("7");		setB.add("8");
		
//		setA.retainAll(setB); // 교집합.
//		setA.addAll(setB); // 합집합. 중복제외 모드 추가
		setA.removeAll(setB); // 차집합.
		
		System.out.println(setA); // 교집합
		
		/*
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}
		System.out.println(setKyo); // 교집합
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!(setB.contains(tmp)))
					setCha.add(tmp);
		}
		System.out.println(setCha);
		
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		System.out.println(setHab);
		*/
		
	}

}
