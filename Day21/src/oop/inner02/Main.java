package oop.inner02;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("ȫ�浿",20,100,78,77,177.4,82.1);
		p.disp();
		
		Person.Score s = p.new Score(100,24,34);
		//s.setKor(20);
		s.disp();

	}

}
