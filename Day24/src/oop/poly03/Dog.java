package oop.poly03;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println("¸Û¸Û");
	}
	
	public void eat() {
		System.out.println("»À´Ù±Í");
	}
	
}
