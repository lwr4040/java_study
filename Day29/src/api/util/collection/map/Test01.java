package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// Map - Key�� Value���� �ѽ����� �����͵��� �����ϴ� �÷���
		// - Key���� ���Ͽ� value���� �����Ѵ�.
		// - key : �ߺ��Ұ� value : �ߺ�����
		// - ������ �������� �ʴ´�.
		// - �������� �⺻������ ������ �̵��� ���Ǵ� ���� map�̴�.

		Map<String, Integer> map = new HashMap<String, Integer>();
		// ������ �߰� .put(key,value)
		map.put("Black", 1);
		map.put("White", 2);
		map.put("Gray", 3);
		map.put("Blue", 4);
		map.put("Red", 5);
		map.put("Green", 6);
		map.put("Black", 2);// ������ key���� ���� ��� value���� �����Ų��.
		//System.out.println(map.get("Black"));
		System.out.println("--------------------------");
		//������ ���� - .replace(K,V)
		//key���� ���Ͽ� ������ key���� value���� ����
		System.out.println(map.replace("black", 3));
		System.out.println(map.get("Black"));
		//System.out.println(map.replace("black", 4));
		//System.out.println(map.get("black"));
		//���� key���� null�� ��ȯ�Ѵ�.
		System.out.println("--------------------------");
		//containsKey(K)		containsValue(V) - �������� ������ Ȯ���ϴ� �޼ҵ�
		System.out.println(map.containsKey("Black"));
		System.out.println(map.containsKey("Pink"));
		System.out.println(map.containsValue(1));
		System.out.println(map.containsValue(3));
		
		System.out.println("--------------------------");
		//.size() - map�� �������� ����
		System.out.println(map.size());
		
		System.out.println("--------------------------");
		//.get(key) - ������ ����
		System.out.println(map.get("Black"));
		System.out.println(map.get("black"));//Ű���� ������ null
		
		System.out.println("--------------------------");
		//������ ���� .remove(key)
		System.out.println(map.get("Black"));
		map.remove("Black");
		System.out.println(map.get("Black"));
		
		System.out.println("--------------------------");
		//������ ��ü ����
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);//value���� key���� ���ؼ��� �����ü��ִ�.
			System.out.println("Key : "+key+"\tValue : "+value);
		}
		
		System.out.println("--------------------------");
		//.clear() - map�ȿ� �����͵��� ��� ���� ��Ȱ
		map.clear();
		System.out.println(map.size());
	}

}