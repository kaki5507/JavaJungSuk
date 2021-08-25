package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new HashSet();
//		Collection c = new TreeSet();
		for(int i=0; i<10; i++) {
			c.add(i);
		}
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// iterator는 1회용이라 다쓰고나면 다시 얻어와야 한다.
		while(it.hasNext()) { // 새로운 iterator객체를 얻는다.
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
