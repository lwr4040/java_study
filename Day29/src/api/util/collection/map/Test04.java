package api.util.collection.map;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
///		(��ü ���� �� �Ʒ��� ������ ����)
//		name		telecom		price
//	[1]	������8		SKT			300000
//	[2] 	G6		LG			330000
//	[3]	������7		KT			510000
		Map<Integer,Mobile> map = new HashMap<>();
		//key�� int	value���� ��ü
		map.put(1, new Mobile("������8","SKT",300000));
		map.put(2, new Mobile("G6","LG",330000));
		map.put(3, new Mobile("������7","KT",510000));
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		int maxPrice = 0;
		String maxName = null;
		while(it.hasNext()) {
			Integer su = it.next();
			Mobile m = map.get(su);
			m.disp(su);
			if(m.getPrice() > maxPrice) {
				maxPrice = m.getPrice();
				maxName = m.getName();
			}
		}
		//���� ������ ��� �ڵ��� �̸� ���
		System.out.println(maxName);
	}

}