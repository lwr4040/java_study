package oop.test01;

public class Main {

	public static void main(String[] args) {
//		name		telecom		price
//	[1]	G6			LG			70만원
//	[2]	아이폰7		KT			95만원
//	[3]	Galaxy S8	SKT			90만원
		Mobile m1 = new Mobile("G6","LG",70);
		Mobile m2 = new Mobile("아이폰7","KT",95);
		Mobile m3 = new Mobile();
		m3.setData("Galaxy S8", "SKT", 90);
		m1.disp(1);
		m2.disp(2);
		m3.disp(3);
		//m3.disp(); - 인자값이 없기때문에 error
	}

}
