package oop.test01;

public class Info {
	//이름,나이
	//멤버변수
	private String name; // 외부에서 접근 불가 ( 단, 클래스에서만 접근 가능 )
	private int age;
	
	//this
	// - 자기 자신을 호출한 객체의 정보를 가지는 참조형 변수
	// - 메소드가 호출될때 자동으로 만들어진다.
	// - 메소드 외부에서는 사용 불가능 **
	// - 클래스의 멤버를 호출할때 this **
	
	// - 형식
	//  	클래스명 this;
	//		this.클래스멤버;
	
	//멤버메소드(setData,disp)
	public void setData(String name,int age) {
		this.name = name;
		this.setAge(age);
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 1) {
			System.out.println("나이를 잘못입력하셨습니다");
			this.age = 1;
			return;//메소드 종료
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
	
	public void disp() {
		System.out.println("이름 : "+this.getName());
		System.out.println("나이 : "+age);
	}
}
