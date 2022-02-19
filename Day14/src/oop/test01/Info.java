package oop.test01;

//코드의 재사용..

// . (멤버 참조 연산자)
// - 클래스의 멤버들을 참조(호출)하는 연산자
// - 클래스의 멤버를 사용하려할때 사용하는 연산자


public class Info {
	
	//멤버변수
	// - 클래스에 저장될 데이터의 공간들..
	// - 공간 선언하듯이 정의하면 된다.
	String name;
	int age;
	
	void setData(String _name,int _age) {//데이터를 저장하는 역활을 하는 메소드
		name = _name;//매개변수 -> 멤버변수
		age = _age;
	}
	
	void disp() {//멤버변수에 있는 데이터 출력
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	String getName() {
		return name;//메소드 -> 메소드 호출한 장소로 값을 보내준다.
	}
	//멤버 메소드
	//메소드 - 한가지의 기능을 수행하고자 만드는 코드의 집합..
	// - 형식
	//	반환자료형		메소드명(매개변수)		{ 코드정의 }
	
	//메소드명 - 메소드를 호출할때 사용하는 이름
	// - 첫글자는 소문자 달라지는 단어의 첫글자는 대문자로 작성한다.
	// - 메소드의 기능이 연상되는 단어로 이름을 지어준다.
	
	//반환 자료형
	// - 메소드가 실행하고 나서 종료될때 돌려주는 값의 형태를 적는 부분
	// - 메소드가 실행하고 난 후에 나온 결과물
	// - 반환값이 없으면 void 반환값이 있으면 값의 형태에 따라 자료형을 적으면 된다.
	// - 반환값은 반환자료형과 일치되어야한다.
	
	//return
	// - 메소드의 종료
	// - 반환값이 있으면 return뒤에 적으면 값이 반환된다.
	// - 단, 반환값은 한개이다.
	
	//매개변수
	// - 매개변수는 메소드가 실행할때 가지고 시작해야 할 값의 형태를 적는 부분
	// - 메소드의 실행 재료
	// - 매개변수의 개수 자료형 순서는 상관없다.
	
	// - 형식
	// - 반드시 자료형과 매개변수명은 한셋트여야한다.
	// - 여러개일 경우 ,를 통하여 구분지어주면 된다.
	//		자료형 매개변수명
}
