package oop.inher02;

public class Main {

	public static void main(String[] args) {
		//상속을 이용하여 다음 클래스 들을 간결한 구조로 재작성
		//힌트 : 겹치는 멤버변수 ( 상속을 이용해서 같은 변수공간 이용 )
		
		FountainPen f = new FountainPen();
		f.setAmount(2);//할머니,할아버지
		System.out.println(f.getAmount());//할머니 할아버지 : Pen
		f.setColor("검은색");
		System.out.println(f.getColor());//부모 : Ballpen
		f.refill(3);
		System.out.println(f.getAmount());//할머니 할아버지 : Pen
		
		BallPen b = new BallPen();
		b.setAmount(5);
		System.out.println(b.getAmount());//부모 : Pen
	}

}
