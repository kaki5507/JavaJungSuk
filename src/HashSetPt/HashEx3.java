package HashSetPt;

import java.util.HashSet;
import java.util.Objects;
public class HashEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add(new String("abc")); // 중복이므로 저장되지 않음.
		set.add(new Person("Seg",10));
		set.add(new Person("Seg",30));
		set.add(new Person("Seg",10));
		set.add(new Person("Seg",10));

		
	}
}

class Person{
	String name;
	int age;
	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+ ":" + age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name , age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {return false;}
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age==p.age;
	}
	
}
