package ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class CacEx1 {

	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr)); // 대문자가 앞

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 X
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));
		
		Integer a = 1;
		Integer b = 2;
		a.compareTo(b);
		System.out.println(a.compareTo(b));
	}

}

class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
	
}