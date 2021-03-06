package api.util.date;

import java.text.*;

public class Test03 {

	public static void main(String[] args) {
		//Format				형식
		//SimpleDateFormat		날짜형식
		//DecimalFormat			숫자형식
		
		int a = 12345678;
		double b = 1234.5678;
		
		//#				숫자를 이 자리에 찍어라. ( 없으면 x )
		//0				숫자를 이 자리에 찍어라.(없어도 O)
		Format f1 = new DecimalFormat("#,###.##");
		System.out.println(f1.format(a));
		System.out.println(f1.format(b));
		
		Format f2 = new DecimalFormat("0,000.00");
		System.out.println(f2.format(a));
		System.out.println(f2.format(b));
	}

}
