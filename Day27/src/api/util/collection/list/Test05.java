package api.util.collection.list;

import java.util.*;

public class Test05 {

	public static void main(String[] args) {
		/*
		 * [문제] 로또 번호 추첨 Collections 클래스와 List중 ArrayList를 
		 * 이용하여 로또 번호 6개를 낮은 번호부터 출력하세요
		 * 
		 * (예상 결과) 이번주 로또 번호
		 *  1 
		 *  11 
		 *  34 
		 *  37 
		 *  41 
		 *  42
		 */
		//[1] List를 1개만 사용해서 처리	(복원추출)
		// - 반복문 6번 , 랜덤 1~45 , 리스트 추가시키기 전에 중복값이 있는지 없는지 확인
		// - 없으면 리스트에 추가, 있으면은 반복문 재실행
		List<Integer> lotto = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int su = (int)(Math.random()*45)+1;
			if(lotto.contains(su)) {
				i--;//반복문 재실행
			}
			else {
				lotto.add(su);
			}
		}
		Collections.sort(lotto);
		for(int i=0;i<6;i++) {
			System.out.println(lotto.get(i));
		}
		//[2] List를 2개 사용하여 처리		(비복원추출)
		// - 1~45까지 반복문돌려서 리스트에 추가
		// - shuffle
		// - 반복문 6번돌려서 새로운 리스트에 6개의 값만 추가
		// - 출력
		lotto.clear();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=45;i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		for(int i=0;i<6;i++) {
			lotto.add(list.get(i));
		}
		Collections.sort(lotto);
		for(int i=0;i<6;i++) {
			System.out.println(lotto.get(i));
		}
	}

}
