package whileloop;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//����ڰ� Ʋ�� ������ ������ ������ �����ϴ� ���α׷� ����
		//		(2 x 1 ���� 19 x 9���� ����)
		//
		//����ڰ� 3������ Ʋ���� ���ӿ���! ��� �޼����� ����� �� ����
		//���� ���� ���� ������ ������ ���
		//
		//[1] �Ϲ� ���� +10��
		//[2] ����� ���� ������ 5�� �߰� (�� 15��)		11�ܺ���~
		Scanner sc = new Scanner(System.in);
		int cnt = 0;//���䰳��
		int over = 0;//Ʋ������
		int sum = 0;//����
		
		while(true) {
			int su1 = (int)(Math.random()* 18)+2;
			int su2 = (int)(Math.random() * 9)+1;
			
			System.out.print(su1 + " x " + su2 +" = ");
			int user = sc.nextInt();
			if(su1 *su2 == user) {
				cnt++;//���䰳�� 1����
				sum += 10;//10���� ���ϱ�
				System.out.println("���� ! 10�� ȹ�� !");
				if(su1 >= 11) {
					sum += 5;//�߰������� 5�����ϱ�
					System.out.println("������ ! �߰� 5�� ȹ��!");
				}
			}
			else {
				over++;//Ʋ��Ƚ��
				if(over == 3) {
					System.out.println("���� ����!");
					System.out.println("���䰳�� : "+cnt+"\t�� ���� : "+sum);
					break;
				}
				System.out.println("�����Դϴ� ! Ʋ�� Ƚ���� "+over+"ȸ �Դϴ�");
			}
		}

	}

}
