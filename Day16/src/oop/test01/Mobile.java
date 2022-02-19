package oop.test01;

public class Mobile {
//	Main.java	main() 메소드를 가지는 클래스
//	Mobile		휴대전화 클래스
//		(항목) 이름, 통신사, 가격
//		(메소드) disp(출력)
//		(생성자) 알아서~
	
	//멤버 변수
	private String name;
	private String tel;
	private int price;
	
	public Mobile() {
		
	}
	
	public Mobile(String name,String tel,int price) {
		this.name = name;
		this.setTel(tel);
		this.price = price;
	}
	//setData
	public void setData(String name,String tel,int price) {
		this.name = name;
		this.setTel(tel);
		this.price = price;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public int getPrice() {
		return price;
	}
	
	public void disp(int i) {
		System.out.println("["+i+"]\t"+name+"\t"+tel+"\t"+price+"만원");
	}
}
