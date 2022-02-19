package oop.poly03;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void bark() {//부모의 추상메소드는 반드시 자식에서 오버라이드 되어야한다.***
		System.out.println("야옹");
	}
	
	public void eat() {
		System.out.println("생선");
	}
}
