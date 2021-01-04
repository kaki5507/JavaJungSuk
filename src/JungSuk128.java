import java.util.HashSet;
import java.util.Objects;

public class JungSuk128 {

	public static void main(String[] args) {
		// HastSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // 중복이라 저장안됨.
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);

	}

}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작.
class Person{
	@Override
	public int hashCode() {
		// int hash(Object.... values); // 가변인자
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p =(Person)obj;
		// 나자신(this)의 이름과 나이를 p와 비교
		return this.name.equals(p.name) && this.age==p.age;
	}

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}
