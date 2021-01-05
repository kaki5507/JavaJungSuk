import java.util.HashMap;

public class JungSuk137p2 {

	public static void main(String[] args) { // Student 클래스 137
		HashMap<String, Student> map = new HashMap<String, Student>(); // JDK1.7부터 생성자에 타입지정 생략가능.
		map.put("자바왕", new Student("자바왕",1,1,100,100,100));
		
		Student s = map.get("자바왕");
		
		System.out.println(s.name);
	} // main

}
