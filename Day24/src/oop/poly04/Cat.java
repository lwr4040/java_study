package oop.poly04;
//extends - 클래스 상속 키워드.. 클래스와 추상클래스 통틀어 단 하나만 상속받을 수 있다.

//CPP에서 다중상속의 문제점들이 존재했다..
// - 메소드의 겹침
// - 부모의 겹침

//JAVA에서는 다중상속의 문제점을 보완하였다.
// - 인터페이스를 통하여 여러개를 상속 받을 수 있다.
// - implements - 인터페이스 전용 상속 키워드.. 인터페이스는 여러개 상속 가능..

public class Cat extends Animal implements Bark,Eat{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println("야옹");
	}

	
	public void eat() {
		System.out.println("생선");
	}

	

}
