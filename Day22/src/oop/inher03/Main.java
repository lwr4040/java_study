package oop.inher03;

public class Main {

	public static void main(String[] args) {
//		(�Ʒ��� ��ü�� ������ �� ���� ���)
//		name	telecom	price	card	month
//	[1]	������7	KT		90����	����ī��	24����
//	[2]	������7	SK		30����	����ī��	30����
//	[3]	G6		LG		35����	�Ｚī��	36����
		MobileEx[] m = new MobileEx[] {
				new MobileEx("������7","KT",90,"����ī��",24),
				new MobileEx("������7","SK",30,"����ī��",30),
				new MobileEx("G6","LG",35,"�Ｚī��",36)
		};
		for(int i=0;i<m.length;i++) {
			m[i].disp(i+1);
		}
	}
}
