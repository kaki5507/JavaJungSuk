package format;

import java.text.DecimalFormat;

public class FormatTest1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");

		try {
			System.out.println(Double.parseDouble("123456.89"));
			Number num = df.parse("1,234,567.89");
			double d = num.doubleValue(); // d=1234567.89
			System.out.println(d + " < d임 ");
			System.out.println(df.format(num));
			
			System.out.println(df2.format(num));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
