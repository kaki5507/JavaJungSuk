package SimpleDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sdf1 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-E요일");
		
		// 오늘 날짜를 yyyy-MM-dd 형태로 변환하여 반환한다.
		String result = df.format(today);
		System.out.println(result);
		System.out.println("----------------");
		
		DateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df3 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df2.parse("2020년 11월 23일");
			String resul2t = df3.format(d);
			System.out.println(resul2t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
