package CollectionsPt;

import java.util.*;

public class Collections1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		List checkedList = Collections.checkedList(list, String.class);
		checkedList.add("abc");
		checkedList.add(new Integer(3));
	}

	

}
