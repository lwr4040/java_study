package arrayQuiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		System.out.print("�� �Է� :");
		int num = sc.nextInt();
		int idx = 0;
		for(int i=0;i<5;i++) {
			if(a[i] != num) {
				b[idx] = a[i];
				idx++;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		System.out.print("��ȣ �Է� :");
		num = sc.nextInt();
		idx = 0;
		for(int i=0;i<6;i+=2) {
			if(c[i] != num) {
				d[idx] = c[i];
				d[idx+1] = c[i+1];
				idx+=2;
			}
		}
		for(int i=0;i<6;i++) {
			System.out.println(d[i]);
		}
	}

}
