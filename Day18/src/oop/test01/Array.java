package oop.test01;

public class Array {
	// Array��� Ŭ������ �����Ͽ� ���� �����Ͱ� ����ǵ��� ����

	// (�����׸�)�迭, lenght(�迭 �������� ����) , size(�迭�� �� ũ��)
	private int[] arr;
	private int length;// �����Ͱ���
	private int size;// �迭�� ��ũ��

	public Array(int num) {
		arr = new int[num];//int[] arr = new int[5];
		this.length = 0;
		this.size = num;
	}
	public Array(int[] arr) {
		this.arr = new int[arr.length];
		this.size = arr.length;//��ũ��
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				this.arr[i] = arr[i];
				length++;//�����Ͱ��� ����
			}
		}
//		for(;arr[length] !=0;length++) {
//			this.arr[length] = arr[length];
//		}//�迭�ȿ� �ִ� �����Ͱ� 0�� �ƴҶ����� �ݺ��ϰڴ�.
	}
	public Array(Array array) {
		this.arr = new int[array.size];//array ��ü�ȿ� �ִ� �� ũ�� �������
		this.size = array.size;
		this.length = array.length;
		
		for(int i=0;i<length;i++) {
			this.arr[i] = array.arr[i];
		}
	}

//	(���)	add(v)			void
//	 - v��� �����͸� ������ĭ�� �߰�
//	 - �ִ� 10��������...
	public void add(int data) {
		if(length == size) {
			System.out.println("�������� ������ �����ϴ�");
			return;
		}
		arr[length] = data;
		length++;
	}
//	get(i)					int
//	 - Ư�� ��ġ�� ������ ����
//	 - i��° ������ ��ȯ - return
	public int get(int i) {
		if(i < 0 || i >= length) {
			System.out.println("�ε��� ������ ������ϴ�");
			return -1;
		}
		return this.arr[i];
	}
//	remove()				void
//	 - ������ �����͸� ����
//	 - ������ ������ ���� ����
	public void remove() {
		if(length == 0) {
			System.out.println("No Data!!");
			return;
		}
		length--;
		arr[length] = 0;
	}
//	size() 					int
//	 - ���� �������� ������ ��ȯ	- return
	public int size() {
		return length;
	}
	public int length() {
		return size;
	}
	
	public void disp() {
		System.out.println("�������� ���� : "+length+"\t�� ũ�� : "+size);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
//add(idx,data) - �ε��� , ��
	
	public void add(int i,int data) {
		if(length == size) {
			System.out.println("�������� ������ �����ϴ�");
			return;
		}
		else if(i >= length) {
			System.out.println("�ε����� ������ ������ϴ�");
			return;
		}
		for(int idx=length-1;i<=idx;idx--) {
			arr[idx+1] = arr[idx];
		}
		arr[i] = data;
		length++;//�������� ����
	}
	
//reSize(int size) - �迭 ���� Ȯ��
	public void reSize(int size) {
		if(this.size >= size) {
			return;
		}
		
		int[] arr = new int[size];
		for(int i=0;i<length;i++) {
			//�޼ҵ庯��   //�������
			arr[i] =    this.arr[i];
		}
		this.arr = arr;
		this.size = size;
		
	}

}
