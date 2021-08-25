package date;

import java.util.Calendar;

public class DateTests {

	public static void main(String[] args) {
//		Calendar cal = new Calendar(); 에러 ! 추상 클래스는 인스턴스 생성할 수 없음.
		Calendar cal = Calendar.getInstance(); // Calendar클래스를 구현한 클래스의 인스턴스를 반환한다.
		int thisYear = cal.get(Calendar.YEAR); // 이번년도 
		System.out.println(thisYear);
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막달
		
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); 
		
	}

}
