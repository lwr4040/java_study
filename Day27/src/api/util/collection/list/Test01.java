package api.util.collection.list;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// List - 데이터의 중복이 허용되고 데이터의 순서가 유지되는 데이터의 목록을
		// 관리하는 컬렉션
		// - 확장형 배열
		List<String> list = new ArrayList<String>();

		// 데이터가 비어있는지 확인
		System.out.println(list.isEmpty());

		// 데이터 추가 .add
		list.add("Black");// 0
		list.add("Red");// 1
		list.add("White");// 2 -> 3
		list.add("Green");// 3 -> 4
		list.add("Gray");// 4 -> 5
		list.add("Black");// 5 -> 6

		list.add(2, "Pink");// 2
		// 데이터의 개수
		System.out.println(list.size());

		// 데이터 유무 검색 - .contains(E)
		System.out.println(list.contains("Black"));
		System.out.println(list.contains("black"));
		System.out.println("-----------------------------");

		// 데이터 추출 - .get(i)
		String color = list.get(2);
		System.out.println(color);
		System.out.println("-----------------------------");

		// 전체 데이터 추출
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------");
		// .indexOf(E) - 원하는 데이터의 인덱스번호 반환
		System.out.println(list.indexOf("Black"));
		System.out.println(list.lastIndexOf("Black"));// 뒤에서부터
		System.out.println("-----------------------------");
		// 데이터 삭제 .remove(E) .remove(i)
		list.remove(0);// 인덱스로 인한 값 삭제
		list.remove("Pink");// 값으로 인한 삭제
		// 전체 데이터 추출
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------");
		List<String> sub = list.subList(0, 2);//미만까지
		
		for(int i=0;i<sub.size();i++) {
			System.out.println(sub.get(i));
		}
	}

}
