package oop.inner01;

public class Main {

	public static void main(String[] args) {
		//��øŬ����
		// - ����
		//	1. �Ϲ� ��ø Ŭ����		- Ŭ���� �ȿ� ��������� ���Ŭ���� - **
		//	2. static��ø Ŭ����	- Ŭ���� �ȿ� ��������� ���Ŭ���� ( ��ü ������ ������� ���ȴ�.) ****
		// 	3. ������øŬ���� - X
		//	4. �͸���øŬ���� - �κ��� ������ ���� - **************
		
		//1. �Ϲ���øŬ����
		// - Ŭ���� �ȿ� ��������� ��� Ŭ����
		// - Ŭ���� ���ο��� � ��ɵ��� ���������� �����Ϸ� �Ҷ� ����Ѵ�.
		Suit s = new Suit();
		//s.b.price = 20000;
		//System.out.println(s.b.price);
		s.price = 10000;
		System.out.println(s.price);
		
		Suit.Top t = new Suit.Top();
		t.price = 15000;
		System.out.println(t.price);
		
		//Suit.Bottom b = new Suit.Bottom();
		Suit.Bottom b1= s.new Bottom();
		b1.price = 13000;
		System.out.println(b1.price);// - �Ʒ��� ��ü
											//���� �ٸ���.
		System.out.println(s.b.price);// - �� ��ü
	}

}
