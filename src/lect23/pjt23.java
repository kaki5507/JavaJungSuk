package lect23;

public class pjt23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LamdaInterface1 li1 = (String s1,String s2,String s3) -> { System.out.println(s1 + "  " + s2 + " " + s3); };
		li1.method("hello", "java", "world");
		
		LamdaInterface2 li3 = (s1) -> System.out.println(s1);
		li3.method("mada");
		
		
	}

}
