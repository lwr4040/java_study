package api.util.date;

import java.text.*;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		//오늘은 yy년 m월 d일 h시 m분 s초입니다.
		//실제 시간처럼 흘러가게 시계만들기
		while(true) {
			Date d = new Date();
			String text = "오늘은 yy년 M월 d일 E a h시 m분 s초입니다";
			Format f = new SimpleDateFormat(text);
			//M : 달 (Month)		m : min (분)
			System.out.println(f.format(d));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
