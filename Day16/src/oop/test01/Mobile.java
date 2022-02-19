package oop.test01;

public class Mobile {
//	Main.java	main() �޼ҵ带 ������ Ŭ����
//	Mobile		�޴���ȭ Ŭ����
//		(�׸�) �̸�, ��Ż�, ����
//		(�޼ҵ�) disp(���)
//		(������) �˾Ƽ�~
	
	//��� ����
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
		System.out.println("["+i+"]\t"+name+"\t"+tel+"\t"+price+"����");
	}
}
