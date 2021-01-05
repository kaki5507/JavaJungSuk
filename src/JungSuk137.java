import java.util.ArrayList;
import java.util.Iterator;

public class JungSuk137 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,2));
		list.add(new Student("자바칩",2,1));

		Iterator<Student> it = list.iterator();
//      Iterator it = list.iterator();
		while (it.hasNext()) {
//			Student s = it.next();
//			Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
//			System.out.println(s.name);
			System.out.println(it.next().name);
			
		}
	}

}

class Student{
	String name = "";
	int ban; // 반
	int no; //번호
	int kor;
	int eng;
	int math;
	
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}