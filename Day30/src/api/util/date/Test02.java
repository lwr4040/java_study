package api.util.date;

import java.text.*;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		//������ yy�� m�� d�� h�� m�� s���Դϴ�.
		//���� �ð�ó�� �귯���� �ð踸���
		while(true) {
			Date d = new Date();
			String text = "������ yy�� M�� d�� E a h�� m�� s���Դϴ�";
			Format f = new SimpleDateFormat(text);
			//M : �� (Month)		m : min (��)
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