import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JungSuk127 {

	public static void main(String[] args) {
		// HashSet - 순서 X , 중복 X
		Object[] arr = {"1",new Integer(1),"2","2","3","3","3","4","4","4"};
		Set set = new HashSet();
		
		for (int i=0; i<arr.length; i++) {
			set.add(arr[i]); // Hashset에 arr 요소들을 저장한다.
		}
		
		System.out.println(set); // HashSet에 저장된 요소들을 출력한다.
		Iterator it = set.iterator(); // HashSet에 저장된 요소들을 출력한다. (Iterator 이용)
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
