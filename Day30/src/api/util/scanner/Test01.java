package api.util.scanner;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//Scanner		�ؽ�Ʈ(text)�� �д� ����. ���ڿ�, ����, URL , Ű���� ���� �� �� �ִ�.
		
		String song = "���ع��� ��λ��� ������⵵��\n�ϴ����� �����ϻ� �츮���󸸼�";
		
		Scanner s1 = new Scanner(song);
		while(s1.hasNext()) {
			System.out.println(s1.hasNext());//���� �ܾ �ִ���
			System.out.println(s1.next());//���� �ܾ �����´�.
		}
		s1.close();
		System.out.println("-------------------------");
		Scanner s2 = new Scanner(song);
		while(s2.hasNextLine()) {
			System.out.println(s2.hasNextLine());//���� ������ �ִ���
			System.out.println(s2.nextLine());//���� ������ �����´�.
		}
		s2.close();
	}

}
