package api.util.collection.list;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * Mobile m[] = new Mobile[] {
		 * 
		 * };
		 */
		//MobileŬ������ ������ list�� ��� �����?
		//list�� Mobile�� �߰� ( ��ü �߰� )
		List<Mobile> m = new ArrayList<>();
		m.add(new Mobile("V20","LG",300000));
		m.add(new Mobile("G5","SK",350000));
		m.add(new Mobile("G6","KT",400000));
		
		//��ü���
		for(int i=0;i<m.size();i++) {
			//Mobile a = m.get(i); Mobile a = new Mobile("V20","LG",300000);
			//a.disp(i+1);
			m.get(i).disp(i+1);
		}
		int su = 1;
		for(Mobile a:m) {//��� for�� m�ȿ� �ִ� �����Ͱ� ���������� ����
			a.disp(su);
			su++;
		}

	}

}