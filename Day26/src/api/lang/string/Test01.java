package api.lang.string;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ȸ������ �α��� ����

		// 1.ȸ������
		// String���� ȸ������ - ���̵�, ��й�ȣ

		// 2.�α���
		// ȸ�������� ���̵� ��й�ȣ�� ��ġ�ϸ��� �α��� ���� ! ��ġ���������� �α��� ���� !

		// 3.����
		// �ݺ��� ����
		String dbId = null;
		String dbPw = null;
		
		String id = null;
		String pw = null;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("1.ȸ������ 2.�α��� 3.����\n�Է� :");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.print("���̵� �Է� :");
				dbId = sc.next();
				System.out.print("��й�ȣ �Է� :");
				dbPw = sc.next();
				System.out.println("ȸ������ �Ϸ� !");
			}
			else if(num == 2) {
				System.out.print("���̵� �Է� :");
				id = sc.next();
				System.out.print("��й�ȣ �Է� :");
				pw = sc.next();
				if(id.equals(dbId) && pw.equals(dbPw)) {
					System.out.println("�α��� ���� !");
				}
				else {
					System.out.println("�α��� ���� !");
				}
			}
			else {
				System.out.println("�����մϴ�");
				break;
			}
		}
	}

}