package oop.test01;

public class Main {

	public static void main(String[] args) {
//		(��ü ���� �� �Ʒ��� ������ ����)
//		name		telecom		price
//	[1]	������8		SKT			300000
//	[2] 	G6		LG			330000
//	[3]	������7		KT			510000
//	�������� ������8�� ������ ���Ͽ� ��� �޴��� �̸��� ���
		Mobile m1 = new Mobile("������8","SKT",300000);
		Mobile m2 = new Mobile("G6","LG",330000);
		Mobile m3 = new Mobile("������7","KT",510000);
		
		m1.disp(1);
		m2.disp(2);
		m3.disp(3);
		//��ü �迭
		Mobile[] arr = new Mobile[3];//�迭���� �����
		arr[0] = new Mobile("������8","SKT",300000);//�迭[0]�ε����� ��ü����
		arr[1] = new Mobile("G6","LG",330000);
		arr[2] = new Mobile("������7","KT",510000);
		for(int i=0;i<3;i++) {
			arr[i].disp(i+1);
		}
		//m1.setName("?"); <- private���� main������ ���Ұ���
		if(arr[2].getPrice() < arr[0].getPrice()) {
			System.out.println(arr[0].getName());
		}
		else {
			System.out.println(arr[2].getName());
		}
		//���� ���ϴ� �޼ҵ�
		arr[0].compare(arr[2]);//�Ű������� �Ѿ�� ������ : arr[2]�ִ� ��ü
								//this�� ��� : arr[0]�ִ� ������
	}

}
