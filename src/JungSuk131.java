import java.util.HashMap;
import java.util.Scanner;

public class JungSuk131 {

	public static void main(String[] args) {
		//HashMap , Hashtable - 순서 x , 중복(키X값O)
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		System.out.println(map); // 중복 안되서 1234 저장됨.
		
		Scanner s = new Scanner(System.in); // 화면으로부터 라인단위로 입력받는다.
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id :");
			String id = s.nextLine().trim();
			
			System.out.println("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id가 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(!(map.get(id).equals(password))) {
				System.out.println("비밀번호가 일치하지않습니다. 다시 입력해주세요.");
			}else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}// while
	}// main

}
