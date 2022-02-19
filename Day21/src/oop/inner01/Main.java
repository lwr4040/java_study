package oop.inner01;

public class Main {

	public static void main(String[] args) {
		//중첩클래스
		// - 종류
		//	1. 일반 중첩 클래스		- 클래스 안에 만들어지는 멤버클래스 - **
		//	2. static중첩 클래스	- 클래스 안에 만들어지는 멤버클래스 ( 객체 생성과 상관없이 사용된다.) ****
		// 	3. 지역중첩클래스 - X
		//	4. 익명중첩클래스 - 부분적 재정의 구문 - **************
		
		//1. 일반중첩클래스
		// - 클래스 안에 만들어지는 멤버 클래스
		// - 클래스 내부에서 어떤 기능들을 세부적으로 관리하려 할때 사용한다.
		Suit s = new Suit();
		//s.b.price = 20000;
		//System.out.println(s.b.price);
		s.price = 10000;
		System.out.println(s.price);
		
		Suit.Top t = new Suit.Top();
		t.price = 15000;
		System.out.println(t.price);
		
		//Suit.Bottom b = new Suit.Bottom();
		Suit.Bottom b1= s.new Bottom();
		b1.price = 13000;
		System.out.println(b1.price);// - 아래의 객체
											//서로 다르다.
		System.out.println(s.b.price);// - 위 객체
	}

}
