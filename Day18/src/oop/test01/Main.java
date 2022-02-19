package oop.test01;

public class Main {

	public static void main(String[] args) {
		
		Array array = new Array(5);//숫자를 넣은만큼 배열의 크기
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
//		arr1[0] = 20; - 주소복사
		System.out.println(arr[0]);
		
		Array a2 = new Array(arr);//배열을 넣어서 배열의 값 a2 멤버변수 배열에 저장
		a2.add(1,4);
		a2.disp();						  //공간의 크기 : arr.length
		Array a1 = new Array(array);//객체를 넣어서 객체안의 배열의 공간의 크기만큼 공간
		a1.reSize(7);//객체 안 배열에 값이 들어있으면 값도 배열에 저장.
		a1.add(1,5);
		a1.disp();
	}

}
