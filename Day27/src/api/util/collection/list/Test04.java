package api.util.collection.list;

import java.util.*;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * [����] ��ٸ� ���� �����
			�Ʒ��� ���� ������ �ǵ��� ��ٸ� ��÷ ������ �����ϼ���
			(���� ���)	�ο��� : 3
			�̸�1 : A
			�̸�2 : B
			�̸�3 : C
			�׸�1 : 1
			�׸�2 : 2
			�׸�3 : 3
			��÷ ����� ������ �����ϴ�
			A �� 3
			B �� 1
			C �� 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� :");
		int su = sc.nextInt();
		sc.nextLine();
		List<String> ls1 = new ArrayList<>(su);//���ϴ� �������� list����
		List<String> ls2 = new ArrayList<>(su);
		
		for(int i=0;i<su;i++) {
			System.out.println("�̸� "+(i+1)+":");
			ls1.add(sc.nextLine());
		}
		for(int i=0;i<su;i++) {
			System.out.println("�׸� "+(i+1)+":");
			ls2.add(sc.nextLine());
		}
		Collections.shuffle(ls2);
		for(int i=0;i<su;i++) {
			System.out.println(ls1.get(i)+" -> "+ls2.get(i));
		}
	}

}