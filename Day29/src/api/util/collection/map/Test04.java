package api.util.collection.map;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
///		(객체 생성 후 아래의 내용을 구현)
//		name		telecom		price
//	[1]	갤럭시8		SKT			300000
//	[2] 	G6		LG			330000
//	[3]	아이폰7		KT			510000
		Map<Integer,Mobile> map = new HashMap<>();
		//key값 int	value값은 객체
		map.put(1, new Mobile("갤럭시8","SKT",300000));
		map.put(2, new Mobile("G6","LG",330000));
		map.put(3, new Mobile("아이폰7","KT",510000));
		
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
		//가장 가격이 비싼 핸드폰 이름 출력
		System.out.println(maxName);
	}

}
