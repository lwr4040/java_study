package oop.test02;

public class Info {
	//멤버변수
	String name;
	int age,score;
	
	//메소드
	void setData(String _name,int _age, int _score) {
		name = _name;
		age = _age;
		score = _score;
	}
	
	void disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성적 : "+score);
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getScore() {
		return score;
	}
}
