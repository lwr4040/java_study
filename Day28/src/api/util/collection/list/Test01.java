package api.util.collection.list;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * Mobile m[] = new Mobile[] {
		 * 
		 * };
		 */
		//Mobile클래스를 저장할 list는 어떻게 만드냐?
		//list에 Mobile을 추가 ( 객체 추가 )
		List<Mobile> m = new ArrayList<>();
		m.add(new Mobile("V20","LG",300000));
		m.add(new Mobile("G5","SK",350000));
		m.add(new Mobile("G6","KT",400000));
		
		//전체출력
		for(int i=0;i<m.size();i++) {
			//Mobile a = m.get(i); Mobile a = new Mobile("V20","LG",300000);
			//a.disp(i+1);
			m.get(i).disp(i+1);
		}
		int su = 1;
		for(Mobile a:m) {//향상 for문 m안에 있는 데이터가 있을때까지 실행
			a.disp(su);
			su++;
		}

	}

}
