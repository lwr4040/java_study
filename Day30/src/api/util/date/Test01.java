package api.util.date;

import java.text.*;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		//Date	시스템 시간을 구하는 클래스
		Date a = new Date();
		Format f = new SimpleDateFormat("yy-MM-dd hh:mm:ss");//지정형식
		
		String time = f.format(a);
		System.out.println(time);

	}

}
