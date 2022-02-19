package oop.poly03;

public class Main {
	public static void eat(Animal a) {
		a.eat();
	}
	public static void bark(Animal a) {
		a.bark();
	}

	public static void main(String[] args) {
		Dog d = new Dog("말라뮤트");
		Cat c = new Cat("고양이");
		
		d.bark();
		c.bark();
		
		Animal a = new Animal("!") {//익명중첩클래스로 통한 객체 생성
			@Override
			public void bark() {
				System.out.println("????????");
				eat();
			}
			public void eat() {
				System.out.println("!!!!!!!!!");
			}
		};
		a.disp();
		a.bark();
		//a.eat(); <- 익명중첩클래스로 인한 객체 생성을 할때 만든 메소드는 불러오기 불가능
		eat(d);
		eat(c);
		
		bark(d);
		bark(c);
	}

}
