package oop.test02;

public class Main {

	public static void main(String[] args) {
		//이름 : 홍길동
		//나이 : 20
		//성적 : 80
		Info in1 = new Info();
		in1.setData("홍길동", 20, 80);
		in1.disp();
		System.out.println(in1.getName());
		//이름 : 이몽룡
		//나이 : 35
		//성적 : 89
		Info in2 = new Info();
		in2.setData("이몽룡",35,89);
		in2.disp();
		System.out.println(in2.getName());
		//이름 : 김나비
		//나이 : 24
		//성적 : 100
		Info in3 = new Info();
		in3.setData("김나비", 24, 100);
		in3.disp();
		System.out.println(in3.getName());
	}

}
