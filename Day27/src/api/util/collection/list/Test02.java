package api.util.collection.list;

import java.util.*;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		[���� ��� ���α׷� ����]
//		����ڿ��� ����ؼ� �������� �Է¹޾� �����ϴ� ����Ҹ� �����Ϸ��� �մϴ�
//		�̹� ��ϵ� å�̸� ����� �����Ǿ����� �մϴ�
//		(���� ���)	
//		������ : � ����
//		���� ����� �Ǿ����ϴ�... ���� ���� 1��
//		������ : Ű�ٸ� ������
//		���� ����� �Ǿ����ϴ�... ���� ���� 2��
//		������ : � ����
//		�̹� ��ϵ� �����Դϴ�.
//		������ : ����
//		���α׷��� �����մϴ�.
//	    1.�������   2.��������    3.�����˻�
		Scanner sc = new Scanner(System.in);
		List<String> book = new ArrayList<>();
		while(true) {
			System.out.print("1.�������    2.��������    3.�����˻�\n�Է� :");
			int select = sc.nextInt();
			sc.nextLine();//enter�� ���� ( buffer ���� )
			if(select == 1) {
				System.out.print("�߰��Ͻ� ���� :");
				String name = sc.nextLine();
				if(book.contains(name)) {
					System.out.println("�̹� ��ϵ� �����Դϴ�");
				}
				else if(name.equals("����")) {
					System.out.println("���α׷��� �����մϴ�");
					break;
				}
				else {
					book.add(name);
					System.out.println("���� ����� �Ϸ�Ǿ����ϴ�..���� ���� "+book.size()+"���Դϴ�..");
				}
			}
			else if(select == 2) {
				System.out.print("���� �Ͻ� ���� : ");
				String name = sc.nextLine();
				if(book.contains(name)) {
					book.remove(name);
					System.out.println("���������� �����Ǿ����ϴ�");
				}
				else {
					System.out.println("�����Ͻ� ������ �����ϴ�");
				}
			}
			else if(select == 3) {
				System.out.print("�˻��Ͻ� ���� �Է� :");
				String name = sc.nextLine();
				if(book.contains(name)) {
					System.out.println(name+"������ "+(book.indexOf(name)+1)+"��° �ֽ��ϴ�");
				}
				else {
					System.out.println("ã���ô� ������ �����ϴ�");
				}
			}
			else {
				System.out.println("�߸��� ��ȣ �Է� !");
			}
		}
	}

}