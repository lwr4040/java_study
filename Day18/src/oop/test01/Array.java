package oop.test01;

public class Array {
	// Array라는 클래스를 구현하여 숫자 데이터가 저장되도록 구현

	// (구성항목)배열, lenght(배열 데이터의 개수) , size(배열의 총 크기)
	private int[] arr;
	private int length;// 데이터개수
	private int size;// 배열의 총크기

	public Array(int num) {
		arr = new int[num];//int[] arr = new int[5];
		this.length = 0;
		this.size = num;
	}
	public Array(int[] arr) {
		this.arr = new int[arr.length];
		this.size = arr.length;//총크기
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				this.arr[i] = arr[i];
				length++;//데이터개수 증가
			}
		}
//		for(;arr[length] !=0;length++) {
//			this.arr[length] = arr[length];
//		}//배열안에 있는 데이터가 0이 아닐때까지 반복하겠다.
	}
	public Array(Array array) {
		this.arr = new int[array.size];//array 객체안에 있는 총 크기 멤버변수
		this.size = array.size;
		this.length = array.length;
		
		for(int i=0;i<length;i++) {
			this.arr[i] = array.arr[i];
		}
	}

//	(기능)	add(v)			void
//	 - v라는 데이터를 마지막칸에 추가
//	 - 최대 10개까지만...
	public void add(int data) {
		if(length == size) {
			System.out.println("데이터의 공간이 없습니다");
			return;
		}
		arr[length] = data;
		length++;
	}
//	get(i)					int
//	 - 특정 위치의 데이터 추출
//	 - i번째 데이터 반환 - return
	public int get(int i) {
		if(i < 0 || i >= length) {
			System.out.println("인덱스 범위를 벗어났습니다");
			return -1;
		}
		return this.arr[i];
	}
//	remove()				void
//	 - 마지막 데이터를 삭제
//	 - 데이터 없으면 실행 중지
	public void remove() {
		if(length == 0) {
			System.out.println("No Data!!");
			return;
		}
		length--;
		arr[length] = 0;
	}
//	size() 					int
//	 - 현재 데이터의 개수를 반환	- return
	public int size() {
		return length;
	}
	public int length() {
		return size;
	}
	
	public void disp() {
		System.out.println("데이터의 개수 : "+length+"\t총 크기 : "+size);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
//add(idx,data) - 인덱스 , 값
	
	public void add(int i,int data) {
		if(length == size) {
			System.out.println("데이터의 공간이 없습니다");
			return;
		}
		else if(i >= length) {
			System.out.println("인덱스의 범위가 벗어났습니다");
			return;
		}
		for(int idx=length-1;i<=idx;idx--) {
			arr[idx+1] = arr[idx];
		}
		arr[i] = data;
		length++;//데이터의 개수
	}
	
//reSize(int size) - 배열 공간 확장
	public void reSize(int size) {
		if(this.size >= size) {
			return;
		}
		
		int[] arr = new int[size];
		for(int i=0;i<length;i++) {
			//메소드변수   //멤버변수
			arr[i] =    this.arr[i];
		}
		this.arr = arr;
		this.size = size;
		
	}

}
