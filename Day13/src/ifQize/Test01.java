package ifQize;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ����) ��������3���� �Է¹ް� ������� 
		// ���� 1) 3������ ����� ������ ������ �ű��.
		// ���� 2) 3������ ����� 100~90 ==> A
		// ���� 3) 3������ ����� 89~80 ==> B
		// ���� 4) 3������ ����� 79~70 ==> C
		// ���� 5) 69����                      ==> ����� 
		// �߰�����) �������뺰�� ���ڸ��� 7�� �̻��� + ���ٴ´�. 
		// ��) 98 ==> A+
		// ��) 89 ==> B+
		// ��) 79 ==> C+
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է� :");
		int score1 = sc.nextInt();
		System.out.print("����2 �Է� :");
		int score2 = sc.nextInt();
		System.out.print("����3 �Է� :");
		int score3 = sc.nextInt();
		int tot = score1+ score2 + score3;
		int avg = tot / 3;
		String grade = null;
		if(avg <= 100 && avg >= 90) {
			grade = "A";
			if(avg % 10 >= 7) {
				grade+="+";//grade = grade + "+"
			}
		}
		else if(avg >= 80) {
			grade = "B";
			if(avg % 10 >= 7) {
				grade+="+";//grade = grade + "+"
			}
		}
		else if(avg >= 70) {
			grade = "C";
			if(avg % 10 >= 7) {
				grade+="+";//grade = grade + "+"
			}
		}
		else {
			grade = "�����";
		}
		System.out.println("��� : "+grade);
		
		if(avg >= 90 && avg <= 100) {
			if(avg >= 97) {
				System.out.println("A+");
			}
			else {
				System.out.println("A");
			}
		}
		else if(avg >= 80) {
			if(avg >= 87) {
				System.out.println("B+");
			}
			else {
				System.out.println("B");
			}
		}
		else if(avg >= 70) {
			if(avg >= 77) {
				System.out.println("C+");
			}
			else {
				System.out.println("C");
			}
		}
		else {
			System.out.println("�����");
		}
	}

}
