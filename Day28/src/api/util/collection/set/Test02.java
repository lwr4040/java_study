package api.util.collection.set;

import java.util.*;

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
		Set<String> set =new HashSet<>();
		Scanner sc = new Scanner(System.in);
		//1.�������	2.��������	3.��������  4.����
		while(true) {
			boolean check = true;
			String book = null;
			Iterator<String> it= null;
			System.out.print("1.������� 2.�������� 3.�������� 4.����");
			int select = sc.nextInt();
			sc.nextLine();
			if(select == 1) {
				System.out.print("���� �Է� :");
				book = sc.nextLine();
				if(set.contains(book)) {
					System.out.println("�̹� �����ϴ� �����Դϴ�");
				}
				else {
					set.add(book);
					System.out.println("���� ����� �Ǿ����ϴ�.. ���� ������ "+set.size()+"���Դϴ�");
				}
			}
			else if(select == 2) {
				System.out.print("å �̸� :");
				book = sc.nextLine();
				it = set.iterator();
				while(it.hasNext()) {
					String bk= it.next();
					if(bk.equals(book)) {
						it.remove();
						System.out.println(book+"å�� �����Ǿ����ϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("å �̸��� ã�� ���߽��ϴ�");
				}
			}
			else if(select == 3) {
				for(String bk : set) {
					System.out.println(bk);
				}
			}
			else if(select == 4) {
				break;
			}
		}
	}

}