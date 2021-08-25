package date;

import java.util.Calendar;

public class DateTest3 {

	public static void main(String[] args) {
		// 날짜 차이 구하는 방법 
		// TimeinMills로 초로 바꾼후 계산
		final int[] TIME_UNIT = {3600, 60, 1}; // 큰 단위를 앞에 놓는다.
		final String[] tIME_UNIT_NAME = {"시간","분","초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10); // time1 10시 20분 30초로 설정
		time1.set(Calendar.MINUTE,20);
		time1.set(Calendar.SECOND,30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20); // time2 20시 30분 10초로 설정
		time2.set(Calendar.MINUTE,30);
		time2.set(Calendar.SECOND,10);
		
		System.out.println(time1.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(time1.get(Calendar.MINUTE)+"분");
		System.out.println(time1.get(Calendar.SECOND)+"초\n");
		
		System.out.println(time2.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(time2.get(Calendar.MINUTE)+"분");
		System.out.println(time2.get(Calendar.SECOND)+"초");
		
		long difference = Math.abs((time1.getTimeInMillis() - time2.getTimeInMillis()) / 1000);
		System.out.println("시간의 차이는 " +difference + "초 입니다.");
		
		String tmp = "";
		
		
		for(int i=0; i < TIME_UNIT.length; i++) {
			tmp += difference/TIME_UNIT[i] + tIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면" + tmp + "입니다.");
	}

}
