package HashMapPt;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("준상","1234");
		map.put("승현",8264);
		System.out.println(map); // 저장 되어 있음
		
		map.put("승현","1111");
		System.out.println(map); // 나중에 저장된 1111이 덮어쓰게 됨.
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 : ");
			String id = s.nextLine().trim();
			
			System.out.println("비밀번호 : ");
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디 존재 X 다시");
				continue;
			}
			
			// id에 맞는 값하고 패스워드 (value)가 다르면
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호 X 다시");
				continue;
			}else {
				System.out.println("아이디 비밀번호 OK");
				break;
			}
		}
		
	}

}
