package input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� 1 ) ����
		//���ϱ�, ����, ���ϱ�, ������(����,�Ǽ�) , ������
		//���� 2���� �Է¹��� �� ����Ͽ� ���
		System.out.print("���� 1 �Է� :");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� :");
		int num2 = sc.nextInt();
		int plus = num1 + num2;//���ϱ�
		int sub = num1 - num2;//����
		int mul = num1 * num2;//���ϱ�
		int div1 = num1 / num2;//��
		double div2 = num1 / (double)num2;//������(�Ǽ�)
		int rem = num1 % num2;//������
		System.out.println("���ϱ� : "+plus);
		System.out.println("���� : "+sub);
		System.out.println("���ϱ� : "+mul);
		System.out.println("������(��) : "+div1);
		System.out.println("������(�Ǽ�) : "+div2);
		System.out.println("������ : "+rem);
		
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.print("���� �Է� :");
		int num = sc.nextInt();
		System.out.println(num % 2 == 1);
		System.out.println(num % 2 != 0);
		
		// ���� 3) ���� 2���� �Է¹޾� ��� ������ 60�� �̻��̸� true���
		System.out.print("���� �Է� :");
		int score1 = sc.nextInt();
		System.out.print("���� �Է� :");
		int score2 = sc.nextInt();
		int tot = score1 + score2;
		double avg = tot / 2.0;
		System.out.println(avg >= 60);
	}

}
