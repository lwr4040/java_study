package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// Map - Key와 Value값을 한쌍으로 데이터들을 관리하는 컬렉션
		// - Key값을 통하여 value값을 관리한다.
		// - key : 중복불가 value : 중복가능
		// - 순서는 유지되지 않는다.
		// - 웹에서의 기본적으로 데이터 이동시 사용되는 것이 map이다.

		Map<String, Integer> map = new HashMap<String, Integer>();
		// 데이터 추가 .put(key,value)
		map.put("Black", 1);
		map.put("White", 2);
		map.put("Gray", 3);
		map.put("Blue", 4);
		map.put("Red", 5);
		map.put("Green", 6);
		map.put("Black", 2);// 동일한 key값을 넣을 경우 value값만 변경시킨다.
		//System.out.println(map.get("Black"));
		System.out.println("--------------------------");
		//데이터 수정 - .replace(K,V)
		//key값을 통하여 동일한 key값의 value값을 변경
		System.out.println(map.replace("black", 3));
		System.out.println(map.get("Black"));
		//System.out.println(map.replace("black", 4));
		//System.out.println(map.get("black"));
		//없는 key값은 null로 반환한다.
		System.out.println("--------------------------");
		//containsKey(K)		containsValue(V) - 데이터의 유무를 확인하는 메소드
		System.out.println(map.containsKey("Black"));
		System.out.println(map.containsKey("Pink"));
		System.out.println(map.containsValue(1));
		System.out.println(map.containsValue(3));
		
		System.out.println("--------------------------");
		//.size() - map의 데이터의 개수
		System.out.println(map.size());
		
		System.out.println("--------------------------");
		//.get(key) - 데이터 추출
		System.out.println(map.get("Black"));
		System.out.println(map.get("black"));//키값이 없으면 null
		
		System.out.println("--------------------------");
		//데이터 삭제 .remove(key)
		System.out.println(map.get("Black"));
		map.remove("Black");
		System.out.println(map.get("Black"));
		
		System.out.println("--------------------------");
		//데이터 전체 추출
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);//value값은 key값을 통해서만 가져올수있다.
			System.out.println("Key : "+key+"\tValue : "+value);
		}
		
		System.out.println("--------------------------");
		//.clear() - map안에 데이터들을 모두 비우는 역활
		map.clear();
		System.out.println(map.size());
	}

}
