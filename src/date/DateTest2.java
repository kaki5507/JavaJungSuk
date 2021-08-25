package date;

import java.util.Calendar;

public class DateTest2 {

	public static void main(String[] args) {
		Calendar d1 = Calendar.getInstance();
		d1.set(2022, 6 ,31);
//		d1.set(Calendar.YEAR,2022);
//		d1.set(Calendar.MONTH,6);
//		d1.set(Calendar.DATE,31);
		
		System.out.println(d1.getTime());
	}

}
