package oop.poly04;
//interface
// - 다중상속 전용 클래스
// - 클래스 변형
// - interface를 붙여서 선언한다.

// - 확실하면 적고 확실하지 않으면 적지마라..
// - 내부에서 정의할 수 있는 멤버들이 제한이 있다..
// - 객체 생성 불가.. 익명 중첩 클래스를 통하여 객체 생성 가능..

public interface Eat {
	//멤버변수
	// - 상수화 변수만 들어가질 수 있다.
	/*public static final*/ String SKILL1 = "q";
	
	//생성자는 존재하지않는다.
	
	//메소드
	// - 추상메소드 아니면 static메소드만 정의 할 수 있다.
	// - 메소드의 형태만 적으면 추상메소드로 들어가진다.
	/*public abstract*/ void eat();
}
