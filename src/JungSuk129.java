import java.util.Set;
import java.util.TreeSet;

public class JungSuk129 {

	public static void main(String[] args) {
		// TreeSet
		Set set = new TreeSet(); // 범위 검색, 정렬. 정렬 필요없음
//		Set set = new HashSet(); // 정렬 필요
		
		for(int i=0; set.size() <6; i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		System.out.println(set);

		TreeSet set2 = new TreeSet();
		String from = "b";
		String to   = "d";
		
		set2.add("abc");	set2.add("bbq");	set2.add("ceil");	set2.add("dialog");	 set2.add("daaaaa");  set2.add("first");
		System.out.println(set2);
		System.out.println("range from = "+from+",to = "+to); // b부터 d까지
		System.out.println("result1 = "+set2.subSet(from, to)); //f전 까지
		System.out.println("result2 = "+set2.subSet(from, "dialog")); //di전까지니깐 da로 시작하면 가능
	}
	
}
