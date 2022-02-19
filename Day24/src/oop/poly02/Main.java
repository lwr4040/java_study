package oop.poly02;

public class Main {
	//Dog와 Cat클래스에 있는 eat라는 메소드를 실행 시킬 수 있는 메소드 작성.
	public static void eat(Dog d) {//eat은 부모에 있는 메소드가 아니기때문에 다형성이용 불가능
		d.eat();
	}
	public static void eat(Cat c) {
		c.eat();
	}
	
	//bark
	public static void bark(Animal a) {//bark는 부모에 오버라이드된 메소드이기때문에 다형성 이용 가능
		a.bark();
	}
	
	public static void main(String[] args) {
		Dog d = new Dog("말라뮤트");
		Cat c = new Cat("고양이");
		Main.eat(d);
		eat(c);
		bark(d);
		bark(c);
	}

}
