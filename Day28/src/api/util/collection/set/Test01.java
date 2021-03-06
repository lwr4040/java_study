package api.util.collection.set;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		
		//Set
		// - 데이터 중복을 허용하지 않고 데이터의 저장순서가 없는 컬렉션
		// - 데이터의 전체를 관리하는 용도로 많이 사용된다.
		
		//제너릭
		// - 내가 원하는 타입으로 만들어주는 문법
		// - 고급프로그래밍으로 가면 갈수록 필요만 문법..
		
		//HashSet
		Set<String> set = new HashSet<>();
		//현재 상황의 제너릭의 역활은 HashSet안에 저장될 요소의 타입을 지정하는 형태
		
		//데이터 추가 - .add
		set.add("Black");
		set.add("Red");
		set.add("White");
		set.add("Green");
		set.add("Gray");
		set.add("Black");
		
		//데이터의 개수 - .size()
		System.out.println(set.size());
		
		//set안에 데이터 있는지 없는지 판단하는 메소드 - .isEmpty()
		// - 비어있으면 true
		System.out.println(set.isEmpty());
		
		//.iterator(); **
		// - 순서가 존재하지 않는 어떠한 객체에서 순서가 있는 형태로 반환해주는 클래스
		// - 반복하여 데이터를 추출할 수 있게 만들어주는 클래스
		// - set은 자력으로 데터를 추출할 수 있는 방법이 없다.
		// - Iterator객체를 통해 데이터를 추출하게 된다.
		// - set에서 remove를 하면 Iterator와 데이터 동기화가 되지 않기때문에
		//  에러가 발생.. iterator에서 remove해주어야한다. ****
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {//다음데이터의 유무
			String color = it.next();//데이터를 가져온다.
			System.out.println(color);
		}
		it = set.iterator();
		//set.remove("Red");
		it.next();
		it.remove();
		while(it.hasNext()) {//다음데이터의 유무
			String color = it.next();//데이터를 가져온다.
			System.out.println(color);
		}
		
		for(String color : set) {
			System.out.println(color);
		}
	}

}
