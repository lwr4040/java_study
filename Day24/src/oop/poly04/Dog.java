package oop.poly04;

public class Dog extends Animal implements Eat,Bark{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println("¸Û¸Û");
	}

	@Override
	public void eat() {
		System.out.println("»À´Ù±Í");
	}

}
