package oop.poly03;

public class Main {
	public static void eat(Animal a) {
		a.eat();
	}
	public static void bark(Animal a) {
		a.bark();
	}

	public static void main(String[] args) {
		Dog d = new Dog("�����Ʈ");
		Cat c = new Cat("�����");
		
		d.bark();
		c.bark();
		
		Animal a = new Animal("!") {//�͸���øŬ������ ���� ��ü ����
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
		//a.eat(); <- �͸���øŬ������ ���� ��ü ������ �Ҷ� ���� �޼ҵ�� �ҷ����� �Ұ���
		eat(d);
		eat(c);
		
		bark(d);
		bark(c);
	}

}
