package api.util.date;

import java.text.*;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		//Date	�ý��� �ð��� ���ϴ� Ŭ����
		Date a = new Date();
		Format f = new SimpleDateFormat("yy-MM-dd hh:mm:ss");//��������
		
		String time = f.format(a);
		System.out.println(time);

	}

}
