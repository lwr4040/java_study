package whileQuiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
		 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����ҷ����Ѵ�.
		 * ��Ʈ) ���� ���� �ݺ����� �߰� ���ָ�ȴ�. 
		 * 1. �����Ƿ�
		 * 		1) Ƽ����
		 * 		2) ����
		 * 		3) �ڷΰ���
		 * 2. �����Ƿ�
		 * 		1) �����
		 * 		2) ġ��
		 * 		3) �ڷΰ���
		 * 3. ����
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			int select = sc.nextInt();
			if(select == 1) {
				while(true) {
					System.out.println("1)Ƽ����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");
					
					select = sc.nextInt();
					if(select == 1) {
						System.out.println("Ƽ������ �����ϼ̽��ϴ�");
					}
					else if(select == 2) {
						System.out.println("������ �����ϼ̽��ϴ�");
					}
					else {
						break;
					}
				}
			}
			else if(select == 2) {
				while(true) {
					System.out.println("1)�����");
					System.out.println("2)ġ��");
					System.out.println("3)�ڷΰ���");
					
					select = sc.nextInt();
					if(select == 1) {
						System.out.println("������� �����ϼ̽��ϴ�");
					}
					else if(select == 2) {
						System.out.println("ġ���� �����ϼ̽��ϴ�");
					}
					else {
						break;
					}
				}
			}
			else {
				break;
			}
		}

	}

}
