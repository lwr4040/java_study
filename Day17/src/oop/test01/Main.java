package oop.test01;

public class Main {

	public static void main(String[] args) {
//		(객체 생성 후 아래의 내용을 구현)
//		name		telecom		price
//	[1]	갤럭시8		SKT			300000
//	[2] 	G6		LG			330000
//	[3]	아이폰7		KT			510000
//	아이폰과 갤럭시8의 가격을 비교하여 비싼 휴대폰 이름을 출력
		Mobile m1 = new Mobile("갤럭시8","SKT",300000);
		Mobile m2 = new Mobile("G6","LG",330000);
		Mobile m3 = new Mobile("아이폰7","KT",510000);
		
		m1.disp(1);
		m2.disp(2);
		m3.disp(3);
		//객체 배열
		Mobile[] arr = new Mobile[3];//배열공간 만들기
		arr[0] = new Mobile("갤럭시8","SKT",300000);//배열[0]인덱스에 객체생성
		arr[1] = new Mobile("G6","LG",330000);
		arr[2] = new Mobile("아이폰7","KT",510000);
		for(int i=0;i<3;i++) {
			arr[i].disp(i+1);
		}
		//m1.setName("?"); <- private여서 main에서는 사용불가능
		if(arr[2].getPrice() < arr[0].getPrice()) {
			System.out.println(arr[0].getName());
		}
		else {
			System.out.println(arr[2].getName());
		}
		//가격 비교하는 메소드
		arr[0].compare(arr[2]);//매개변수로 넘어가는 데이터 : arr[2]있는 객체
								//this를 담당 : arr[0]있는 데이터
	}

}
