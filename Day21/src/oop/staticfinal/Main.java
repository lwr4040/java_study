package oop.staticfinal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//static final - ���ȭ ����
		// - ���� ����� ���ȴ�.
		// - ������ �̸��� �ֱ⶧���� �ٽ� �ҷ��� �� ������ �����͸� ������ �� ���� ����
		// - ���α׷��󿡼� �ǹ̸� ������ �ְ� �� �ǹ̰� ������� �ʴ� �����͵��� ���� ����
		//  �����Ͽ� ����ϱ� ���ؼ�..
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
		
		Scanner sc = new Scanner(System.in);
		
		char key = sc.next().charAt(0);
		switch(Character.toLowerCase(key)) {//�ҹ��ڷ� ��ȯ
		case Key.SKILL1:
			System.out.println("SKILL1");
			break;
		case Key.SKILL2:
			System.out.println("SKILL2");
			break;
		case Key.SKILL3:
			System.out.println("SKILL3");
			break;
		case Key.SKILL4:
			System.out.println("SKILL4");
			break;
		default:
			System.out.println("�߸��� ���� �Է� !");
		}
	}

}
