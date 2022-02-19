package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) /*throws InterruptedException*/ {
		//Exception - ����
		// - ���α׷� ���� �߿� �ܺ����� �������� ���� �߻��ϴ� ����
		// - ���ܴ� �츮�� ó�� �����ϴ�.
		// - ���� �߻��Ǵ� ���ܵ��� Ŭ����ȭ ���ѳ��Ҵ�.
		
		//����ó��
		// - ���ܰ� �߻������� ���α׷��� ���������� �۵��� �� �ֵ��� ó���ϴ°�..
		
		// - ����� �ΰ����� �����Ѵ�.
		//		1. throws - JVM���� ó���� �ñ�� ���
		//		 - �޼ҵ� �ڿ� �߻��� ���ܵ��� throws�� ���� �ڿ� ����θ�ȴ�.
		
		//		2. try ~ catch - ���� ���� ���ܸ� ó���ϴ� ���
		//		 - try  : ���� ���� ���� ���� - �ʼ�
		//		 - catch : ���� ó�� ���� - �ʼ�
		//		 - finally : �ʼ��ڵ带 ���� ���� - ����

		// - ����
		//		try{
		//			�ڵ�����
		//		}catch(ó���� ���� Ŭ������ ������ ���� ����){// - �Ű�����ó�� �����ϸ�ȴ�.
		//			ó���ڵ�����
		//		}finally{
		//			�ʼ��ڵ�����
		//		}
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = 0 , b = 1;
			try {
				System.out.print("���� �Է� :");
				a = sc.nextInt();
				System.out.print("���� �Է� :");
				b = sc.nextInt();
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.err.println("������ �Է��ϼž��մϴ�");
			}
			try {
				System.out.println(a + " + "+ b+" = "+(a+b));
				System.out.println(a + " - "+ b+" = "+(a-b));
				System.out.println(a + " * "+ b+" = "+(a*b));
				System.out.println(a + " / "+ b+" = "+(a/b));
				System.out.println(a + " % "+ b+" = "+(a%b));
			}catch(ArithmeticException e) {
				System.err.println("0���� ���� �� �����ϴ�");
			}
		}
	}

}