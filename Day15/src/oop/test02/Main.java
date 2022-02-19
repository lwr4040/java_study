package oop.test02;

public class Main {

	public static void main(String[] args) {
		Info in = new Info();
		in.setData("홍길동", 20);
		in.disp();
		
		Info in1 = new Info("홍길동",30);
		in1.disp();
		
		Info in2 = new Info("이몽룡"); //생성자는 new 라는 객체 생성시 단 한번만 실행
		in2.disp();
		
		//Info in3 = new Info(30); <- 나이생성자 x
	}

}
