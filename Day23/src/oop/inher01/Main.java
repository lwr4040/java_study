package oop.inher01;

public class Main {

	public static void main(String[] args) {
//		(�հ�, ��� ���� ����� �������� �Ʒ��� ��ü�� ���� �� ���� ���)
		//		name	java	c	python  �հ�  ���
		//[1] 	������	80		85	90
		//[2] 	��Ʈ��	90		85	80
		//[3] 	���۸�	100		20	25
		
		StudentEx[] st = new StudentEx[] {
				new StudentEx("������",80,85,90),
				new StudentEx("��Ʈ��",90,85,80),
				new StudentEx("���۸�",100,20,25)
		};
		for(int i=0;i<st.length;i++) {
			st[i].disp(i+1);
		}
	}

}
