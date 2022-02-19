package api.util.collection.list;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			list.add(i);//�߰��� int/Integeer ���� ( auto - boxing )
		}
		System.out.println(list);
		
		//List�� ��� Collections��� ���� Ŭ������ ������ �޾� �پ��� ó����
		//������ �� �ִ�.
		
		//(cf) Arrays Ŭ����
		//[1] ������ ���� ���		.shuffle()
		Collections.shuffle(list);
		System.out.println(list);
		
		//[2] ������ ���			.reverse()
		Collections.reverse(list);
		System.out.println(list);
		
		//[3] ����
		Collections.sort(list);
		System.out.println(list);
	}

}
