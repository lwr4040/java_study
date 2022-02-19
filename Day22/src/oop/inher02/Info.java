package oop.inher02;

public class Info {
	//멤버변수 - 나이,이름
	//생성자 - 디폴트생성자, 이름생성자, 나이 이름 생성자
	//멤버메소드 - setter, getter , disp
	private String name;
	private int age;
	public Info() {
		System.out.println("부모 디폴트 생성자 실행 !");
	}
	
	public Info(String name) {
		this.name = name;
		this.age = 1;
		System.out.println("부모 이름 생성자 실행 !");
	}
	
	public Info(String name,int age) {
		this.name = name;
		this.setAge(age);
		System.out.println("부모 이름 나이 생성자 실행 !");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
