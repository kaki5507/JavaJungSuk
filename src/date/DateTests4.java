package date;

import java.util.Calendar;

public class DateTests4 {

	public static void main(String[] args) {
		Calendar d4 = Calendar.getInstance();
		System.out.println(d4.get(Calendar.DATE));
		d4.clear(); // 전체  초기화  1970년 00000으로 됨.
		System.out.println(d4.getTime());
		d4.clear(Calendar.DATE); // 이렇게 하면 DATE는 1으로 초기화됨. 일 표시
		System.out.println(d4.get(Calendar.DATE));
	}

}
