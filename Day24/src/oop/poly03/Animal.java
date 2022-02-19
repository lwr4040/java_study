package oop.poly03;
//추상클래스
// - abstract를 붙여서 정의한 클래스
// - 추상메소드를 가지고 있는 클래스.. X
// - 부모의 역활을 수행하기 위해 만들어지는 클래스
// - 일반적으로 객체 생성 불가.. 익명 중첩클래스를 통해 임시적으로 객체 생성 가능
// - 자식 클래스에서 추상메소드를 오버라이드 해주어야한다.
//   추상메소드를 오버라이드하지 않으면 자식 클래스도 추상클래스로 만들어야한다.

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void disp() {
		System.out.println("이름 : "+name);
	}
	
	//추상메소드 - 빈껍데기 메소드
	// - 다형성을 위해서 부모클래스에 정의하는 메소드
	// - 부모클래스에서는 정의할 내용이 마땅하지 않으면 다형성을 위해서 정의한다.
	// - abstract를 붙여서 정의한다.
	public abstract void bark();
	public abstract void eat();
}
