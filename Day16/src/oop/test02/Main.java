package oop.test02;

public class Main {

	public static void main(String[] args) {
//		�Ʒ��� �׸��� ����ð� ���� ���
//		id	
//	[1]	����			���� 20���� ���� �� ���� ���
//	[2]	������		���� 15�� ���� �� ���� ���
//	[3]	���γ�		���� 30���� ���� �� ���� ���	
		
		Player p1 = new Player("����");
		Player p2 = new Player("������");
		Player p3 = new Player("���γ�");
		
		p1.setLev(20);
		p1.setLev(15);
		p1.setLev(25);
		p2.setLev(15);
		p3.setLev(30);
		
		p1.disp();
		p2.disp();
		p3.disp();

	}

}
