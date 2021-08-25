package HashMapPt;

import java.util.*;
public class StringCounting {

	public static void main(String[] args) {
		String[] data = {"A","B","A","C","B","C","C","C"};
		
		HashMap map = new HashMap();
		
		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i],value+1);
			}else {
				map.put(data[i],1);
			}
		}
		System.out.println(map);
		
		
	}

}
