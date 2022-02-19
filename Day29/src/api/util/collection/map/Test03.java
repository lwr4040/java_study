package api.util.collection.map;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// ��ȭ��ȣ �̸� �� �����ϰ� ���� Map���� �����ϱ�...
		// ������ �߰� , ���� , ���� , ����
		//�̸��� �ߺ� ���� , ��ȭ��ȣ�� �ߺ� �Ұ���
		Map<String,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String name = null;
			String tel = null;
			System.out.print("1.�߰� 2.���� 3.���� 4.����\n�Է� :");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.print("�̸� �Է� :");
				name = sc.next();
				System.out.print("��ȭ��ȣ �Է� :");
				tel = sc.next();
				if(map.containsKey(tel)) {
					System.out.println(tel+"��ȣ�� �̹� �����մϴ�");
				}
				else {
					map.put(tel, name);
					System.out.println(name+"���� ������ �߰��Ǿ����ϴ�");
				}
				break;
			case 2:
				System.out.print("��ȣ �Է� :");
				tel = sc.next();
				
				if(map.remove(tel) != null) {
					System.out.println(tel+"��ȣ�� �����Ǿ����ϴ�");
				}
				else {
					System.out.println(tel+"��ȣ�� ���������ʽ��ϴ�");
				}
				break;
			case 3:
				System.out.print("�̸� �Է� :");
				name = sc.next();
				System.out.print("��ȣ �Է� :");
				tel = sc.next();
				
				if(map.containsKey(tel)) {
					map.replace(tel, name);
					System.out.println(name+"���� ������ �����Ǿ����ϴ�");
				}
				else {
					System.out.println(tel+"��ȣ�� ���������ʽ��ϴ�");
				}
				break;
			case 4:
				Set<String> set = map.keySet();
				for(String key : set) {
					System.out.println(map.get(key)+" : "+ key);
				}
				break;
			default:
				System.out.println("�߸��� �Է� !");
			}
			
			
		}
	}

}
