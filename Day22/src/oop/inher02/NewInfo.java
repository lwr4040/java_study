package oop.inher02;

public class NewInfo extends Info{
	private double hei;
	
	//this - 자기자신 ( 자식)
	//super - 부모
	
	//별다른 명시가 없으면 자식클래스에서는 부모의 디폴트생성자가 호출된다.
	//부모의 디폴트 생성자가 없으면 에러 발생..
	
	public NewInfo() {
		System.out.println("자식 디폴트 생성자 실행 !");
	}
	
	//부모의 멤버변수를 초기화 하려면 자식클래스의 생성자에서 부모의 멤버변수초기값까지 함께
	//받아주어야한다.
	
	public NewInfo(String name,int age,double hei) {
		super(name,age);//부모 생성자에 값을 넘긴다.
		this.hei = hei;//자식 ( 자기자신 )
		System.out.println("자식생성자");
	}
	
	public void setHei(double hei) {
		this.hei = hei;
	}
	
	public double getHei() {
		return hei;
	}
	
	public void disp() {
		//super.disp();//부모메소드 disp
		System.out.println("이름 : "+super.getName());
		System.out.println("나이 : "+super.getAge());
		System.out.println("키 : "+hei);//자식 멤버변수
	}
	
}
