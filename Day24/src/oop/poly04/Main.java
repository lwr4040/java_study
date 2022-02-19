package oop.poly04;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog("말라뮤트");
		Cat c = new Cat("고양이");
		
		d.bark();
		d.eat();
		c.bark();
		c.eat();
		
		Bark b = new Bark() {

			@Override
			public void bark() {
				System.out.println("?????");
			}
			
		};
		b.bark();

	}

}
