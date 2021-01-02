import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JungSuk124 {

	public static void main(String[] args) {
		// Iterator , Enumeration, Map과 Iterator
		// 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		it = list.iterator(); // iterator은 1회용이라 다쓰고나면 다시 얻어와야 한다.
		
		for (int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
	}

}
