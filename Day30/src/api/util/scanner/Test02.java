package api.util.scanner;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//.next()�� ���⸦ �������� �ܾ �����Ѵ�.
		String text = "��-��-��-��/��-��-��";
		
		Scanner s1 = new Scanner(text);
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		s1.close();
		
		// - �� �����ڷ�(delimeter)�� ����
		Scanner s2 = new Scanner(text);
		//s2.useDelimiter("-");
		//s2.useDelimiter("/");
		s2.useDelimiter("[-/]");//�ΰ��� �̻��� �����ڸ� ó���Ҷ��� []�ȿ� �־��־���Ѵ�.
		while(s2.hasNext()) {
			System.out.println(s2.next());
		}
		s2.close();

	}

}