package switchcase;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//����, ����, ���������Է� ���� ��
		//��� double
		//100~90����� ���� A
		//80����� ���� B
		//70����� ���� C
		//60����� ���� D
		//�� �� ��� ���� F
		
		//switch ���� cast�ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		int kor = sc.nextInt();
		System.out.print("���� �Է� :");
		int eng = sc.nextInt();
		System.out.print("���� �Է� :");
		int math = sc.nextInt();
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		
		switch((int)avg / 10) {
		case 10:
		case 9:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		case 7:
			System.out.println("C����");
			break;
		case 6:
			System.out.println("D����");
			break;
		default:
			System.out.println("F����");
		}

	}

}
