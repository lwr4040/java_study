package api.util.collection.list;

public class Mobile {
//	Main.java	main() �޼ҵ带 ������ Ŭ����
//	Mobile		�޴���ȭ Ŭ����
//		(�׸�) �̸�, ��Ż�, ����
//		(�޼ҵ�) disp(���)
//		(������) �˾Ƽ�~
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
