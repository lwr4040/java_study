package dowhile;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//���� �Է� : 10
		//�Է��Ͻ� ���ڴ� 10�Դϴ�
		//���� �Է� : 20
		//�Է��Ͻ� ���ڴ� 20�Դϴ�
		//���� �Է� : 0
		//�Է��Ͻ� ���ڴ� 0�Դϴ�
		
		// - 0�̿��� �ٸ� ���ڸ� �Է��ϸ� ��� ���ڸ� �Է¹��� �� �ְ�
		// 0�� �Է��ϸ� 0�� ����ϰ� �ݺ� ����
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("���� �Է� :");
			num = sc.nextInt();
			System.out.println("�Է��Ͻ� ���ڴ� "+num+"�Դϴ�");
		}while(num != 0);
		
	}

}
