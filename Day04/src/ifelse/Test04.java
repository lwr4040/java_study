package ifelse;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�����˻� ( ���� �Ѱ� �Է� )
		//100~90�����̸� ���� A
		//89~80�����̸� ���� B
		//79~70�����̸� ���� C
		//69~60�����̸� ���� D
		//�� �̿��� ��� ������ F
		System.out.print("���� �Է� :");
		int score = sc.nextInt();
		//1. ��� if�� ���¹�� ( �������� )
		if(100>=score && score >= 90) {
			System.out.println("A");
		}
		if(90>score && score>=80) {
			System.out.println("B");
		}
		if(80>score && score>=70) {
			System.out.println("C");
		}
		if(70>score && score>=60) {
			System.out.println("D");
		}
		if(60>score) {
			System.out.println("F");
		}
		
		//2. else if�� Ư¡�� ����ϴ� ���
		if(score>=90 && score <= 100) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		//[��ȭ] ���� 3���Է¹��� �� �����
		//100~90�����̸� ���� A
		//89~80�����̸� ���� B
		//79~70�����̸� ���� C
		//69~60�����̸� ���� D
		//�� �̿��� ��� ������ F
		System.out.print("���� 1 �Է� :");
		int score1 = sc.nextInt();
		System.out.print("���� 2 �Է� :");
		int score2 = sc.nextInt();
		System.out.print("���� 3 �Է� :");
		int score3 = sc.nextInt();
		int tot = score1 + score2 + score3;
		double avg = tot / 3.0;
		if(avg<=100 && avg >=90) {
			System.out.println("A");
		}
		else if(avg >= 80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else if(avg >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
