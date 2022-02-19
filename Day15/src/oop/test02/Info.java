package oop.test02;

public class Info {
	//멤버변수
	private String name;
	private int age;
	
	//생성자
	public Info() {
		System.out.println("디폴트 생성자 호출");
		this.age = 1;//기본값
	}
	
	public Info(String name) {//이름생성자
		System.out.println("이름 생성자 호출");
		this.name = name;
		this.age = 1;
	}
	
	public Info(String name,int age) {
		System.out.println("이름 나이 생성자 호출");
		this.name = name;
		this.setAge(age);
	}
	//setData, disp, setName, setAge , getter(return )
	public void setData(String name,int age) {
		this.name = name;//변수는 대입연산자
		this.setAge(age);//메소드는 ()로 호출
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			System.out.println("나이를 잘못 입력하셨습니다");
			return;
		}
		this.age = age;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//disp
	public void disp() {
		System.out.println("이름 : "+this.getName());
		System.out.println("나이 : "+this.getAge());
	}
}
