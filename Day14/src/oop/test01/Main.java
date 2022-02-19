package oop.test01;

public class Main {

	public static void main(String[] args) {
		Info in = new Info();
		//Scanner sc = new Scanner(System.in);
		//sc : 객체명
		in.setData("홍길동", 20);//인자값 : 매개변수로 들어가는 데이터
		in.disp();
		String name = in.getName();
		System.out.println(name);
		
		Info in2 = new Info();
		in2.setData("이몽룡", 30);
		in2.disp();
		in.disp();
		

	}

}
