package api.lang.exception;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		���� ó���� �̿��Ͽ� �Ʒ��� ������ �����ϼ���
//
//		����ڿ��� �г����� �Է¹޵��� �ϰڽ��ϴ�
//
//		�Ʒ��� 2���� ���ǿ� ��߳� ��� ���� ���
//		[1] 3~10���ڸ� ����� ���
//		�� 3~10���� �̳��� �ۼ��ϼ���

//		[2] ��ڶ�� �ܾ ���Ե� ���
//		�� ��ڶ�� �ܾ�� ���Խ�ų �� �����ϴ�

		// ������Ʈ�˻�
		String[] blacklist = new String[] { "�ٺ�", "��û��", "����" };
		Scanner sc = new Scanner(System.in);
		String nick = null;
		while(true) {
			try {
				System.out.print("�г��� �Է� :");
				nick = sc.next();
				if(nick.length() < 3 || nick.length() > 10) {
					throw new Exception("3~10���� �̳��� �ۼ��ϼ���");
				}
				else if(nick.indexOf("���") != -1) { // >= 0
					//���ԵǾ������� �ε��� ��ȣ�� ��ȯ.. ������ -1�� ��ȯ
					throw new Exception("��ڶ�� �ܾ ���� ��ų �� �����ϴ�");
				}
				//������ũ �˻�
				for(int i=0;i<blacklist.length;i++) {
					if(nick.indexOf(blacklist[i])>=0) {
						throw new Exception("������Ʈ �� �ܾ��Դϴ�");
					}
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
