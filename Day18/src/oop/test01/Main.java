package oop.test01;

public class Main {

	public static void main(String[] args) {
		
		Array array = new Array(5);//���ڸ� ������ŭ �迭�� ũ��
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		System.out.println(array.get(1));
		array.remove();
		array.disp();
		int[] arr = new int[10];
		
		arr[0] = 1;
		arr[1] = 2;
//		int[] arr1;
//		arr1 = arr;
//		arr1[0] = 20; - �ּҺ���
		System.out.println(arr[0]);
		
		Array a2 = new Array(arr);//�迭�� �־ �迭�� �� a2 ������� �迭�� ����
		a2.add(1,4);
		a2.disp();						  //������ ũ�� : arr.length
		Array a1 = new Array(array);//��ü�� �־ ��ü���� �迭�� ������ ũ�⸸ŭ ����
		a1.reSize(7);//��ü �� �迭�� ���� ��������� ���� �迭�� ����.
		a1.add(1,5);
		a1.disp();
	}

}
