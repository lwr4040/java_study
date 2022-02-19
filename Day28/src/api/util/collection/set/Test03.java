package api.util.collection.set;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// �̸��� ��ȭ��ȣ�� �����Ҽ� �ִ� Ŭ������ ����� set���� �����ϱ�...
		// ������ �߰� , ���� , ����
		//��, �����̸��� �߰��� �Ұ��� .. ������ �̸��� �����Ұ�츸 ����
		Set<Info> set = new HashSet<>();
		Scanner sc =new Scanner(System.in);
		while(true) {
			boolean check = true;
			Iterator<Info> it = null;
			String name = null;
			String tel = null;
			System.out.print("1.�߰�  2.����  3.����  4.����\n�Է� :");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print("�̸� :");
				name = sc.next();
				System.out.print("��ȣ :");
				tel = sc.next();
				
				for(Info in : set) {
					if(in.getName().equals(name)) {
						System.out.println("���� �̸��� �����մϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					set.add(new Info(name,tel));
					System.out.println(name+"���� ������ �߰��Ǿ����ϴ�");
				}
			}
			else if(select == 2) {
				System.out.print("�̸� �Է� :");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					Info in = it.next();
					if(in.getName().equals(name)) {
						it.remove();
						System.out.println(name+"���� ������ �����Ǿ����ϴ�");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("�̸��� ã�� ���߽��ϴ�");
				}
			}
			else if(select == 3) {
				for(Info in: set) {
					in.disp();
				}
			}
			else if(select == 4) {
				break;
			}
			else {
				System.out.println("�߸��� ��ȣ �Է� !");
			}
		}
	}

}