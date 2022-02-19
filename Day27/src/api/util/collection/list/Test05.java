package api.util.collection.list;

import java.util.*;

public class Test05 {

	public static void main(String[] args) {
		/*
		 * [����] �ζ� ��ȣ ��÷ Collections Ŭ������ List�� ArrayList�� 
		 * �̿��Ͽ� �ζ� ��ȣ 6���� ���� ��ȣ���� ����ϼ���
		 * 
		 * (���� ���) �̹��� �ζ� ��ȣ
		 *  1 
		 *  11 
		 *  34 
		 *  37 
		 *  41 
		 *  42
		 */
		//[1] List�� 1���� ����ؼ� ó��	(��������)
		// - �ݺ��� 6�� , ���� 1~45 , ����Ʈ �߰���Ű�� ���� �ߺ����� �ִ��� ������ Ȯ��
		// - ������ ����Ʈ�� �߰�, �������� �ݺ��� �����
		List<Integer> lotto = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int su = (int)(Math.random()*45)+1;
			if(lotto.contains(su)) {
				i--;//�ݺ��� �����
			}
			else {
				lotto.add(su);
			}
		}
		Collections.sort(lotto);
		for(int i=0;i<6;i++) {
			System.out.println(lotto.get(i));
		}
		//[2] List�� 2�� ����Ͽ� ó��		(�񺹿�����)
		// - 1~45���� �ݺ��������� ����Ʈ�� �߰�
		// - shuffle
		// - �ݺ��� 6�������� ���ο� ����Ʈ�� 6���� ���� �߰�
		// - ���
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