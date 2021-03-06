package api.util.collection.list;

public class Mobile {
//	Main.java	main() 메소드를 가지는 클래스
//	Mobile		휴대전화 클래스
//		(항목) 이름, 통신사, 가격
//		(메소드) disp(출력)
//		(생성자) 알아서~
	private String name,tel;
	private int price;
	
	public Mobile(String name,String tel,int price) {
		this.name = name;
		this.tel = tel;
		this.setPrice(price);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setPrice(int price) {
		if(price < 0) {
			this.price = 0;
			return;
		}
		this.price= price;
	}
	
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
		System.out.println("["+i+"]\t"+name+"\t"+tel+"\t"+price);
	}
}
