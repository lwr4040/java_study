package oop.poly04;

public abstract class Animal {//추상클래스
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void disp() {
		System.out.println("이름 : "+name);
	}
	
	//public abstract void bark();
	//public abstract void eat();
}
