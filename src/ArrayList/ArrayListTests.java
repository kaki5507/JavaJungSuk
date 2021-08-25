package ArrayList;

import java.util.ArrayList;

public class ArrayListTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList(10);
		System.out.println(arr.isEmpty());
		int i=0;
		for(int j=0; j<10; j++) {
			arr.add(Math.ceil(Math.random()*100));
		}
		while(!arr.isEmpty()) {
			System.out.println(arr.get(i));
			i++;
		}
	}

}
